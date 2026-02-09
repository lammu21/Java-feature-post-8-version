// A Lambda Expression is a short form of writing a function.

// Syntax 

// (parameters) -> expression/body

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

interface  A 
{
    void show();
}

interface B 
{
    double add(double i , double j);
}

public class LambdaBasics {
    public static void main(String[] args) 
    {
        A obj  = () -> System.out.println("In Show ");

        obj.show();

        B obj2 = (i, j) -> i+j;

        System.out.println(" Multiple parameter Lambda Expression " + obj2.add(5.5, 99.5));

        Runnable lambdaTask = () -> System.out.println(" No Parameter Lambda running ");

        lambdaTask.run();

//--------------- Java inbuilt FunctionalInterfaces---------------------------
        Consumer <String> greet = name -> System.out.println("Single parameter Lambda running  " + name);
        
        greet.accept("Lammu");

        Predicate <Integer> isEven = (n) -> n % 2 == 0;

        System.out.println(isEven.test(10));

        System.out.println(isEven.test(21));

               
// --------------- Lambda with Collections ---------------
         List <String> names = Arrays.asList("Java", "Lambdas","FunctionalInterface");
         
//  ----------------Sort using lambda
          
        Collections.sort(names,(a,b) -> a.compareTo(b));
        System.out.println("Sorted: " + names);

// ----------------iterating using lambda
        System.out.println("-----------Lambda as iterator");
        names.forEach(name-> System.out.println(name));
// ---------------  Method Reference  ---------------
        
        
        System.out.println("-----Method Reference------");
        names.forEach(System.out::println);

      }
    }

