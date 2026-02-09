package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps 
{
    public static void main(String[] args) {
    // 1. collect is used to convert the stream data to a collections list 
            List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
                
            List<Integer> streamlist = numbers.stream().collect(Collectors.toList());

            System.out.println("collect example : \n" + streamlist);
        
    // 2. forEach : it takes consumer as parameter and loops to list and prints elements of stream or list 
                      numbers.stream()
                      .forEach(System.out::print);
    
    // 3. reduce : multiple elements -> combined provide single output.
        //  takes identity and accumulator as parameters
            Optional<Integer> reducefunction = numbers.stream()
                         .reduce((x,y) ->x+y);

            System.out.println("reduce function example \n" + reducefunction.get());

            Optional<Integer> reduceFunction = numbers.stream()
                                                .reduce(Integer::sum);

            System.out.println("reduce function with method reference example \n" + reducefunction.get());
             

    // 4. count : takes the list gives the count 
         
          System.out.println(numbers.stream().count());
        
    // 5. anyMatch ; return true any one of values match

          System.out.println("anyMatch example  :" +numbers.stream().anyMatch(num -> num>10));

    // 5. allMatch : return true if all values match

        System.out.println("allMatch :"+ numbers.stream().allMatch(num -> num<11));

    // 6. noneMatch  : return true if all values doesnt match
        System.out.println("noneMatch : " +numbers.stream().noneMatch(num-> num>11) );

    // 7. findfirst() : return first element 
        System.out.println("findfirst : "+ numbers.stream().findFirst().get());

    // 8.forEachOrdered : used to print element from paralle stream in ordered way 

       System.out.println("printing numbers  of paralle stream using forEach");
       numbers.parallelStream().forEach(System.out::print);/// output is unordered way 76911084235

       System.out.println("printing numbers  of paralle stream using forEachOrdered");
       numbers.parallelStream().forEachOrdered(System.out::print);//output is order way 12345678910%

    
          





    }

}
