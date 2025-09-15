import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Stream is a sequence of element, that supports functional style operations
// Stream dont store dont, it just works and process on data elements 
// A Stream once used cannot be reused
// Stream can be Sequential or parrallel

public class Stream {
    public static void main(String[] args) {
        List<String> name = Arrays.asList
                                    ("Spring boot", "SpringFrame","microservices","java","Spring boot");

// 1.-------------------.filter(Predicate)------------------------------


// below line String list is converted to Stream
        List <String> Springnames = name.stream()
// then using .filter() method we filtered words from list which contains Spring
                                         .filter(n -> n.contains("Spring"))
                                         .toList();

       System.out.println("---filter function example--- \n"+Springnames);

// -------------------.map(Function)------------------------------
// map transforms each element into another
// Syntax : stream.map(element -> function)

      List <Integer> namelengths = name.stream()
                                       .map(String :: length)
                                       .toList();

      System.out.println("---map function example--- \n"+ namelengths);

// -------------------.sorted()------------------------------

     List<String> nameSorted = name.stream()
                                   .sorted()
                                   .toList();


     System.out.println("---sorted function example--- \n"+ nameSorted);
    
// -------------------.distinct()------------------------------

    List<String> distinctname = name.stream()
                                    .distinct()
                                    .toList();


     System.out.println("---distinct function example--- \n"+ distinctname);

 
// -------------------.limit()------------------------------


    List<String> limitname = name.stream()
                                 .limit(1)
                                 .toList();


       System.out.println("---limit function example--- \n"+ limitname);



// -------------------.collect()------------------------------
     Set <String> collectname = name.stream()
                                 .collect(Collectors.toSet());


       System.out.println("---collect function example--- \n"+ collectname);
// -------------------.forEach(consumer)------------------------------
// Syntax : .stream().forEach(System.out::println)
    System.out.println("---forEach function example----");
        name.stream().forEach(System.out::println);
// -------------------.reduce(identity,accumulator)---------------------------------------
// Syntax : .reduce(0,(a,b) -> a+b)
 
        int totalLength = name.stream()
                              .map(String::length)
                              .reduce(0,(a,b)->a+b);
        System.out.println("---reduce function example---- \n"+ totalLength);
    
// -------------------.count()----------------------------------------

       long count = name.stream()
                         .count();
    
         System.out.println("---count function example---- \n"+ count);
        

// -------------------.parallel()-------------------------------------
System.out.println("---count function example----");

name.parallelStream().forEach(System.out :: println);

    }
    
}
