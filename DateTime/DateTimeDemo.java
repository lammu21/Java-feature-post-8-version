package DateTime;

import java.security.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Flow.Subscription;

// java.time package is introduced in Java 8 
//  it is immutable and thread safe 
// Clear separation between date, time ,date-time , zones,duration


public class DateTimeDemo {

    public static void main(String[] args) 
    {

        // different java.time classes with examples as below
        
        // LocalDate : only date (no time , no timeZone)

        // Syn/Example
        System.out.println("---------LocalDate Demo---------");
        LocalDate date = LocalDate.now(); 
        
        System.out.println("Current Date : "+date);

        LocalDate birthday = LocalDate.of(1998,8,21);
        System.out.println("My Birthday : "+birthday);


        // LocalTime : only time (no date , no timeZone)
        System.out.println("---------LocalTime Demo---------");

        LocalTime time = LocalTime.now();
        System.out.println("Current Time : "+time);

        LocalTime givenTime = LocalTime.of(8,30);
        System.out.println("Given Time : "+givenTime);

        // LocalDateTime : date + time (no timeZone)
        System.out.println("---------LocalDateTime Demo---------");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date & Time : "+dateTime);

        // ZonedDateTime : date +time +zone 

        System.out.println("---------ZonedDateTime Demo---------");

        ZonedDateTime zoneddateTime = ZonedDateTime.now();        

        System.out.println("Current Date ,time &zone : "+zoneddateTime);

        // Instant : Machine Timestamp(Seconds,nanoSeconds since epoch 1970-01-01T00:00:00Z)
        // Methods : now(ZoneId), withZoneSameInstanst(),getZone()

        System.out.println("---------Instant Demo---------");

        Instant timestamp = Instant.now();

        System.out.println("Current Timestamp : "+timestamp);

        // period : human readable amount of time (years,months,dates)
        // Methods : between(), getYears(), getMethod(),getDays();
        System.out.println("---------Period Demo---------");

        Period period = Period.between(birthday, date);
        System.out.println("Period between my birthday and today : "+period);
        System.out.println("Years : "+period.getYears());
        System.out.println("Months : "+period.getMonths());
        System.out.println("Days : "+period.getDays());

        // Duration : Machine duratiion (hours,minutes,seconds,nanos)

        // Methods : between() , toHours(), toMintues(), toSeconds(), toNanos()
        System.out.println("---------Duration Demo---------");
        Duration duration = Duration.between(birthday.atStartOfDay(), date.atStartOfDay());
        System.out.println("Duration between my birthday and today : "+duration); 
        System.out.println("Days : "+duration.toDays());

        // DateTimeFormatter : Formatting and parsing date and time
        // Methods : ofPattern(), format(), parse()
        System.out.println("---------DateTimeFormatter Demo---------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted date & time : " +formattedDateTime);
        System.out.println("Normal Date & Time : " +dateTime);


        // Real-time use cases of java.time package 
        // Storing timestamp in database : Instant
        // Formatting and parsing user input to DateTimeFormatter
        // Handling different time zones : ZonedDateTime
        // Calculating age duration : Period , Duration

        // Example :  Calculating Subscription expiry date 

        // Code : 
            LocalDate start = LocalDate.now();

            LocalDate expDate = start.plusMonths(6);

            if(LocalDate.now().isAfter(expDate))
            {
                System.out.println("Subscription expired on : "+expDate);
            }
            else
            {
                System.out.println("Subscription is valid till : "+expDate);
            }


        // Example : Calculate Db timestampe 
        // Code : 
            Instant dbTimeStamp = Instant.now();
            
            LocalDateTime dbDateTime = LocalDateTime.ofInstant(dbTimeStamp,ZoneId.systemDefault());

            System.out.println("DB TimeStamp : "+dbTimeStamp);
        }

}
