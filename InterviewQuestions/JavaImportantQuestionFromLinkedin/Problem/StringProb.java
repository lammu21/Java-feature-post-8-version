package InterviewQuestions.JavaImportantQuestionFromLinkedin.Problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringProb {

    public static void main(String[] args)
    {
// LIST OF STRINGS 
// 1. find the longest String from list
    List<String> words = Arrays.asList("Java", "SpringBoot",null, "API","Sai teja Nedunoori","Shayam",null);

        String result =  words.stream()
                            .max(Comparator.comparing(String::length))
                            .orElse("");

    // System.out.println(result);

// 2.String with perfix Index 
   List<String> resuls1 =     words.stream()
                                    .filter(s->s.toLowerCase().startsWith("sh"))
                                    .toList();

    // System.out.println(resuls1);

// 3.Convert to toUpperCase
    List<String> upperCase = words.stream()
                                  .map(s->s.toUpperCase())
                                  .toList();

    // System.out.println(upperCase);

// 4.Sort String list based on String length
    List<String> sortedwords =   
                                words.stream()
                                .sorted(Comparator.comparing(String::length))//// natural order is Alpha order
                                .toList();


    // System.out.println(sortedwords);

    // 5. Join Strings 
    String joinedString = 
                              words.stream()
                              .collect(Collectors.joining(","));///Return Strings


        // System.out.println(joinedString);

    // 6. Palindrome
     String s ="madam";
       Boolean val = s.equals(new StringBuilder(s).reverse().toString());
    //    System.out.println(val);
              
// 3️⃣ Remove null values
    List<String> nonNull =   
         words.stream()
        .filter(Objects::nonNull)
        .collect(Collectors.toList());
        // .toList();
        System.out.println(nonNull);
        
              
    }
}