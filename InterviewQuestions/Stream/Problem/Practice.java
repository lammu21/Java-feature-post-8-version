package InterviewQuestions.Stream.Problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
        // Find first non-repeating character

        String s = "PPrograming";

   Character ans =     s.chars()
        .mapToObj(c-> (char) c)
        .collect(Collectors.groupingBy(
            c->c, Collectors.counting()
        ))
        .entrySet().stream()
        .filter(x->x.getValue()==1)
        .map(x->x.getKey())
        .findFirst()
        .get();

        System.out.println(ans);
 // 14.	Count frequency of each character
     Map<Character,Long> ans1=   s.chars()
     .mapToObj(c->(char)c)
     .collect(Collectors.groupingBy(
        c->c,Collectors.counting()
     ));
        
     System.out.println(ans1);

   


    // Find longest string in a list

    List <String> names = Arrays.asList("Sai","Teja","Nedunoori");
    String ress= names.stream()
     .max(Comparator.comparing(String::length))
     .get();
     
     System.out.println(ress);


//    19.	Join strings using delimiter
      String name =names.stream().collect(Collectors.joining(""));

      System.out.println(name);
      
// 20.	Check if a string is palindrome using streams
    String name1 = "madam";

// System.out.println(IntStream.range(0, name1.length() / 2)
//                 .allMatch(i -> name1.charAt(i) == name1.charAt(name1.length() - i - 1)));

    Boolean isPalindrome = IntStream.range(0,name1.length()/2)
     .allMatch(i->name1.charAt(i)==name1.charAt(name1.length()-i-1));

     System.out.println(isPalindrome);


    


     
      } 

}
