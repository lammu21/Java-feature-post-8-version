package Stream.Problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharProb {
    public static void main(String[] args) {

        // find the duplicates characters in given string 
        String s = "poograamminng";

                        s.chars()
                        .mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                        .entrySet()
            .stream().filter(c->c.getValue()>1)
            .forEach(System.out::println);

    
    // First non-repeating character

    
      Character res = s.chars().mapToObj(c->(char)c)
      .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
      .entrySet().stream().
      filter(c->c.getValue()==1)
      .map(c->c.getKey())
      .findFirst().get();

        // System.out.println(res);


    // 13. First repeating character


    Character res1= s.chars()
      .mapToObj(c->(char)c)
      .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
      .entrySet()
      .stream()
      .filter(c->c.getValue()>1)
      .map(c->c.getKey())
      .findFirst()
      .get();

      System.out.println(res1);




    //   frequency of each character
    s.chars()
    .mapToObj(c->(char)c)
    .collect(Collectors.groupingBy(c->c,Collectors.counting()))
    .entrySet()
    // .stream().filter(c->c.getValue()>0)
    .forEach(System.out::println);


    // find the longest string in the list 
    String[] str = {"sai","teja","Nedunoori"};

      String longestword= Arrays.stream(str)
       .max(Comparator.comparing(String::length)).orElse("");
       System.out.println(longestword);

    //    Comparator

    


    }
    
}
