package InterviewQuestions.Stream.Problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
// import java.util.Collector;
import java.util.stream.Collectors;

public class NumProb {
    public static void main(String[]args)
    {

// 1.. filter even numbers from List
      List<Integer> numbers = Arrays.asList(1,2,4,5,7,8,9,12,14,16,17,1,2,4);
       
      List<Integer> evenNumbers = 
      numbers.stream()
       .filter(x->x%2==0)
       .toList();
    //    .forEach(System.out::println);

    // System.out.println(evenNumbers);

// 2.    find the numbers greater than given numbers 

    List<Integer> num_5 = numbers.stream()
                                    .filter(n->n>5)
                                    .collect(Collectors.toList());
                        
    // System.out.println(num_5);

// 4.Convert List to Set 
    Set<Integer> numSet = numbers.stream()
                                   .collect(Collectors.toSet());

    // System.out.println(numSet);


    //5. convert List to Map

    List<String> names = Arrays.asList("Java", "Spring");
   Map<String,Long> namesMap= names.stream()
    .collect(Collectors.groupingBy(c->c,Collectors.counting()));

    Map<String,Integer>namesMap2 = names.stream().collect(Collectors.toMap(c->c,String::length)); 
    // System.out.println(namesMap2);


///6. Count elements from a list 
        Long numOfElement = numbers.stream()
                                    .count();

            // System.out.println(numOfElement);
        
// 7️⃣ Sort ascending / descending
        List<Integer> ascendingOrdNum=numbers.stream()
                                            .sorted().toList();
        List<Integer> desOrdNum = numbers.stream()
                                        .sorted(Comparator.reverseOrder())
                                        .toList();

        // System.out.println("Ascending"+ascendingOrdNum+" "+"DesendingOrder"+ desOrdNum);

// 8️⃣ Remove duplicates

    List<Integer> nonDupNum = numbers.stream().distinct().toList();
    // System.out.println("Original List" +numbers);
    // System.out.println("Non Duplicate Number"+nonDupNum);

// 9️⃣ First element
     int firstElement =numbers.stream().
                               findFirst().
                               get();
                            //    orElse(null);
    // System.out.println(firstElement);

// 10 anyMatch allMatch noneMatch
    Boolean anymatch = numbers.stream()
                       .anyMatch(x->x%2==0);// return Boolean Values 

    Boolean allMatch = numbers.stream()
                       .allMatch(x->x>-1);
                    
    Boolean noneMatch = numbers.stream()
                               .noneMatch(x->x>1);


    // System.out.println("anymatch\n "+anymatch+" allMatch\n "+allMatch+" noneMatch\n "+noneMatch);


    // 21️⃣ Max / Min
    int max = numbers.stream()
                        .max(Integer::compare)
                        .get();

    int min = numbers.stream()
                    .min(Integer::compare).get();

    // System.out.println("Max "+ max+" min "+min);

    // 22️ Second highest
       int secondHighest = numbers.stream()
                               //.skip(2).max(Integer::compare).get(); this won't work
                               .sorted(Comparator.reverseOrder())
                               .skip(2)
                               .findFirst()
                               .get();

        //  System.out.println(secondHighest);

        //  23️⃣ Sum
        int summedValue = numbers.stream()
                                .mapToInt(x->x)
                                .sum();
                            //  .reduce((a,b)-> a+b)
                                //   .get();
       
        //  System.out.println(summedValue);

        // 24️⃣ Average
        Double average = numbers.stream()
                             .mapToInt(c->c)
                             .average()
                             .orElse(0);

        // System.out.println(average);


        // 25️⃣ Partition even / odd

         Map<Boolean,List<Integer>> evenOddNum = numbers.stream()
                                         .collect(Collectors.partitioningBy(x->x%2==0));
                                        
        //  System.out.println(evenOddNum);


        //  26️⃣ Missing number
        
         List<Integer> num = Arrays.asList(1,2,3,4,5,7);

          int n =num.size()+1;
        //   System.out.println(n);

         int expectedSum = (n*(n+1))/2;

         int acutalSum = num.stream()
                            .reduce((a,b)->a+b).get();

        // System.out.println("Missing Number "+ (expectedSum-acutalSum));


        // 27️⃣ Numbers starting with 1
        List<Integer> starts1=  numbers.stream()
          .filter(x->String.valueOf(x).startsWith("1"))
          .toList();

        //   System.out.println(starts1);


        //   28️⃣ Square & filter

      List<Integer> res= numbers.stream()
                               .map(x->x*x)
                               .filter(x->x>2)
        .collect(Collectors.toList());

        // System.out.println(res);

    //  29 29️⃣ Multiply all numbers
     Long multi = numbers.stream()
                         .mapToLong(Integer::longValue)// to integer to long 
                        .reduce(1L,(a,b)->a*b);// 1L to return from reduce as Non Optional value Integer
                        // .get();


     System.out.println(multi);





                    






    }
}
