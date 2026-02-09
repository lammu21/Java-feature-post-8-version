package Stream;
import java.util.*;
import java.util.stream.Stream;

//types of stream which enables parallel processing of data 
// multiple thread will access different parts of parallel streams
// we need use parallel stream where tasks are independent

public class ParallelStream 
{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<Integer> numlist = Stream.iterate(1,x->x+1).limit(20000).toList();

        List<Long>factorialNum = numlist.stream().map(ParallelStream::factorialMethod).toList();

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken by sequential stream  "+ (endTime - startTime)+"ms"); //15ms 

        startTime = System.currentTimeMillis();

        factorialNum = numlist.parallelStream().map(ParallelStream::factorialMethod).toList();

        endTime = System.currentTimeMillis();
   
        System.out.println("Time taken by Parallel stream  "+ (endTime - startTime)+"ms"); ////3ms

        // System.out.println("Examples where parallel stream gives data in consistency in dependent tasks");

        // Cu

    }


    private static long factorialMethod(int n)
    {
        long results =1;
        for (int i = 0; i < n; i++) {
            results*=i;
            
        }
        return results;
    }
    
}
