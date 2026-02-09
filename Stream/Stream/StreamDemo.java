package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Stream is a sequence of element, that supports functional style operations
// Stream dont store, it just works and process on data elements, A Stream once used cannot be reused,Stream can be Sequential or parallel
// how does stream work 
// 1.Source, 
// 2. Intermediate Operation
// 3. Terminal Operation 
// 

public class StreamDemo {
    public static void main(String[] args) 
    {
// --- Different ways to create streams 
// 1. collection.stream() 
// creating from a collections like examples list(), arrayList()
     List<Integer> list =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> streamList = list.stream();
//2. Arrays.stream()
     String [ ]  array = {"q","d","r","t","l","m"};
       
     Stream<String> arrayStream 
                  = Arrays.stream(array);
// 3. Stream.of()
    Stream<String> stringstream 
                  = Stream.of("q","r","o");

// 4.Stream.generate(),it generates infinite stream
    
                   Stream.generate(()->1)
                       .limit(100)
                     .forEach(System.out::println);
    // System.out.println("infinite Stream. " + infinitestream);



// // 1.-------------------.filter(Predicate)------------------------------
// // if we want filter some elements from given list use .filter in that case below example explains it
//             List<String> name = Arrays.asList
//                             ("Spring boot", "SpringFrame","microservices","java","Spring boot");
//             List <String> Springnames = name.stream()
//                                             .filter(n -> n.contains("Spring"))
//                                             .toList();
//             System.out.println("---filter function example--- \n"+Springnames);

// // -------------------.map(Function)------------------------------
// // map transforms each element into another
// // Syntax : stream.map(element -> function)

//       List <Integer> namelengths = name.stream()
//                                        .map(String :: length)
//                                        .toList();

//       System.out.println("---map function example--- \n"+ namelengths);

// // -------------------.sorted()------------------------------

//      List<String> nameSorted = name.stream()
//                                    .sorted()
//                                    .toList();


//      System.out.println("---sorted function example--- \n"+ nameSorted);
    
// // -------------------.distinct()------------------------------

//     List<String> distinctname = name.stream()
//                                     .distinct()
//                                     .toList();


//      System.out.println("---distinct function example--- \n"+ distinctname);

 
// // -------------------.limit()------------------------------


//     List<String> limitname = name.stream()
//                                  .limit(1)
//                                  .toList();


//        System.out.println("---limit function example--- \n"+ limitname);



// // -------------------.collect()------------------------------
//      Set <String> collectname = name.stream()
//                                  .collect(Collectors.toSet());


//        System.out.println("---collect function example--- \n"+ collectname);
// // -------------------.forEach(consumer)------------------------------
// // Syntax : .stream().forEach(System.out::println)
//     System.out.println("---forEach function example----");
//         name.stream().forEach(System.out::println);
// // -------------------.reduce(identity,accumulator)---------------------------------------
// // Syntax : .reduce(0,(a,b) -> a+b)
 
//         int totalLength = name.stream()
//                               .map(String::length)
//                               .reduce(0,(a,b)->a+b);
//         System.out.println("---reduce function example---- \n"+ totalLength);
    
// // -------------------.count()----------------------------------------

//        long count = name.stream()
//                          .count();
    
//          System.out.println("---count function example---- \n"+ count);
        

// // -------------------.parallel()-------------------------------------
// System.out.println("---count function example----");

// name.parallelStream().forEach(System.out :: println);



// name.stream().collect(Collector.of(null, null, null, null));

    }
    
}
