package InterviewQuestions.Stream;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Collectors are utility class provied methods to collect into common Collection
public class CollectorsDemo {
    public static void main(String[] args) {

// 1. toList() -> collect to a List
                List<String> names = Arrays.asList("lammu","saiteja","saiteja","nedunoori","nirmala","nimma");

                List<String> namesStartWithN = names.stream()
                                                    .filter(name -> name.toUpperCase().startsWith("N"))
                                                    .collect(Collectors.toList());
                                
                System.out.println(namesStartWithN);
            
    // 2.Collecting to a set 
                System.out.println(names);
                Set<String> namesSet = names.stream().collect(Collectors.toSet());
                System.out.println(namesSet);

    // 3. Collecting to Specific collection

              ArrayDeque<String> collectDeque = names.stream()
                                                .filter(x->x.startsWith("c"))
                                                .collect(Collectors.toCollection(() -> new ArrayDeque<>()));
              ArrayDeque<String> colArrayDeque = names.stream()
                                                        .collect(Collectors.toCollection(ArrayDeque:: new ));
            System.out.println("ArrayQuery "+colArrayDeque);
                                            

    // 4. joining(); used to join string 
              String concentenated = names.stream().collect(Collectors.joining(","));
              System.out.println(concentenated);

    
    //   5. SummarizingInt() : used to get statical values 


           List<Integer> numList =Arrays.asList(1,2,3,4,5,6);
           
           IntSummaryStatistics statics = numList.stream().collect(Collectors.summarizingInt(x->x));

           System.out.println(statics.getMax());
           System.out.println(statics.getCount());
           System.out.println(statics.getMin());
           System.out.println(statics.getAverage());
           System.out.println(statics.getSum());

    // 6. calculating Element 
           long count = numList.stream().collect(Collectors.counting());
           System.out.println(count);
         

    //  7. grouping Elements : it groups the elements in map based on key you have choose 
    // Collector.groupBy(classifier) -> classifier will decide which bucket or key to element will go 
    // return Map<K,List<T>>
    //
              Map<Integer,List<String>> names1 = names.stream()
                                          .collect(Collectors.groupingBy(String::length));/// String::length it will became key 
                                                                                    // //names of same length becames list<String>
              System.out.println(names1);

              names1.entrySet().forEach(entry -> System.out.print(entry.getKey() +"->" +entry.getValue()));

              TreeMap<Integer,Long> treeMap =   names.stream()
                     .collect(Collectors.groupingBy(String :: length,TreeMap::new,Collectors.counting()));

              treeMap.entrySet().forEach(entry -> System.out.println("TreeMap "+entry.getKey()+"->"+entry.getValue()));
              
    //// Partitioning elements : Dividing group into only groups based on predicate given 
    ///  Syntax : Collectors.partitionBy(predicate)
    /// return Map<Boolean,List<T>>
    
              Map<Boolean,List<String>> namesGreaterThanFize = names.stream().collect(Collectors.partitioningBy(n->n.length()>5));
              System.out.println(namesGreaterThanFize);

              numList.stream().collect(Collectors.partitioningBy(x->x%2==0)).forEach((k,v) -> System.out.print(k +"->"+v));

}
}
