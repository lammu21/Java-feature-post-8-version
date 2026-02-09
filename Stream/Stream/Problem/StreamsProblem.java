package Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsProblem {
    public static void main(String[] args) {

// problems from engineering digest after terminal opertions

// 1. filtering names based certain length  and collecting names 
        List<String> namesList =  Arrays.asList("Anna","bob","Charlie","David");

        List<String> namesGreaterThan3Len = namesList.stream()
                                                      .filter(name -> name.length()>3)
                                                      .toList();
        System.out.println(namesGreaterThan3Len);

// 2.Squaring and sorting numbers
       List<Integer> numList = Arrays.asList(11,14,15,19,16,22,29,33);
       List<Integer> squareNum = numList.stream().map(num -> num*num).sorted().toList();
       System.out.println(squareNum);

// 3.summing values 
      double summedValue = numList.stream().reduce((a,b)->a+b).get();
      System.out.println(summedValue);

// 4.Counting Occurence of Character 
      String sentence = "Hello World";
      System.out.println("count of Char " +sentence.chars().filter(x->x=='l').count()); /// count char 'l'

// 5. Counting word Occurences 
       
     String sentence1 = "Hello Hello java Java world world";
     Map<String,Long> map1=Arrays.stream(sentence1.split("\\s+"))
                            .map(String::toUpperCase)
                           .collect(Collectors.groupingBy(x->x,Collectors.counting()));

     System.out.println("Counting word Occurences "+ map1);

// 6.Collecting Names by length 
List<String> nameList = Arrays.asList("anna","bob","brian");

System.out.println(nameList.stream().collect(Collectors.groupingBy(String::length)));

// 7.Partitioning even and odd numbers using Partitioning 
List<Integer> numList2 = Arrays.asList(1,2,3,4,5,6,7);
System.out.println(numList2.stream().collect(Collectors.partitioningBy(x->x%2==0)));


//🔥BASIC (Must-Know)
// 1.	Filter even / odd numbers
            List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,0,12,14,15,17,19);
            List<Integer> evenNumbers = 
                          numbers.stream()
                          .filter(num -> num%2==0)
                          .toList();
            System.out.println(evenNumbers);
// 2.	Find numbers greater than a given value
     List<Integer> greaterThan5 =
                   numbers.stream()
                   .filter(num -> num>5)
                   .collect(Collectors.toList());
            System.out.println(greaterThan5);
                    
// 3.	Remove null values from a list
     List<String> names  =
              Arrays.asList("sai","teja",null,"chintu", "Mallaiah","nirmala",null);

              List<String> nonNull 
                         = names.stream()
                          .filter(Objects :: nonNull)
                          .toList();
            System.out.println(nonNull);
// 4.	Convert List to Map 
    List<String> names1  =
                Arrays.asList("sai","teja","chintu", "Mallaiah","nirmala");

        Map<String,Integer> nameHashMap = 
                                 names1.stream()
                                 .collect(Collectors.toMap(name -> name , String::length));

        System.out.println(nameHashMap);
                
// 5.Convert List to Set using streams
   Set<String> namesSet 
                 = names.stream()
                 .collect(Collectors.toSet());
      System.out.println(namesSet);

// 6.	Find count of elements
      System.out.println(names.stream().count());
// 7.	Sort numbers in ascending / descending order
      System.out.println(numbers.stream().sorted().toList());
      System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).toList());
// 8.	Remove duplicates from a list
      List<Integer> num = 
                    Arrays.asList(1,2,3,1,1,1,2,2,2,4,4,4,5,5,6,7,8,8,9,9,9,9,9);
      System.out.println(num.stream().distinct().toList());
// 9.	Find first element of a stream
      Optional<Integer> firstElement 
                    =num.stream()
                    .findFirst();
      System.out.println(firstElement.get());
// 10.	Check if any / all / none match a condition
     boolean isEven = num.stream()
                      .allMatch(n -> n%2==0);
    System.out.println(isEven);
    boolean greaterThan6 = num.stream()
                          .anyMatch(n-> n>6);
    System.out.println(greaterThan6);

    boolean nonNegative = num.stream()
                          .noneMatch(n -> n>0);
    System.out.println(nonNegative);

// ----String problems

// 11.. given a sentence find the word has the highest length
  
 String s = "i am learning java steams api";
  
 String ans = Arrays.stream(s.split(" "))
                     .max(Comparator.comparing(String ::length))
                     .get();

System.out.println(ans);


// 12. remove duplicates from string and return in same order 

 String word = "saaaiteejjja";
 String res =   Arrays.stream(word.split(""))
    .distinct().collect(Collectors.joining());

    System.out.println(res);

 


// 13. print the characters that appears more than once 
  Map<Character,Long>  answer = word.chars()    /// converst string to characters
           .mapToObj(c -> (char) c)/// converts chars to character object since primitiver char won't work with streams
           .collect(Collectors.groupingBy(c->c,Collectors.counting()));// c count of char appearing in word 


           answer.entrySet().stream().filter(c->c.getValue()>1).forEach(System.out::println);


// 14.. find the word that have second highest length
String s22 = " i am Learning java Streamssssssss";

   String resultss =Arrays.stream(s22.split(" "))
   .sorted(Comparator.comparing(String::length).reversed()).skip(0).findFirst().get();

   System.out.println(resultss);

// 15. given a sentence find the Occurence of each word ?
  Map<String,Long>ans1=Arrays.stream(s22.split(" "))
  .collect(Collectors.groupingBy(x->x,Collectors.counting()));

  System.out.println(ans1);

//   16. find the word with specificed number of vowelx
//     Arrays.stream(s22.split(" ")).filter.replaceAll("[aeiouAEIOU]","").length()==2




    }

}
