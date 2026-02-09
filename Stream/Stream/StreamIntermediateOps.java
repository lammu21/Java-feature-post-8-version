package Stream;
import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOps 
{
    // Intermediate operations in streams are to perform/transform/converts one form stream to another form 
    // Intermediate Ops are lazy operations, they wont execute until a Terminal operations invoke them
    public static void main(String[] args) 
    {
    // 1.filter() : it used to filter data from stream based on given condition
    // // filter will take predicate a parameter filter(predicate)
    // Example :
            List<String> names = Arrays.asList("akshith","amruth","adithya","chandu","bharath","sai","sai","adithya");
                names.stream()
                    .filter(name-> name.toUpperCase().startsWith("A"))
                    .forEach(System.out::println);///terminal Operation 
    // 2.map(): it will take function as parameter 
                List<String> mapNames = names.stream()
                                        .map(x->x.toUpperCase())
                                        .toList();
                                    
                System.out.println("map Example  \n"+mapNames);

                // same example using Method Reference
                List<String> mapNames1 = names.stream()
                                            .map(String::toUpperCase)
                                            .toList();
                System.out.println("map Example with method reference \n"+mapNames);
    // 3.sorted() : used to sorted the data based on give comparator or default comparator 
                List<String> sortedNames = names.stream()
                                                .sorted() /// natural ordered of string class
                                                .toList();
                System.out.println(sortedNames);
                      
                List<String> sorteNames2 = names.stream()
                                           .sorted((A,B)-> B.length() - A.length()) // sorted using desired comparator 
                                           .toList();
                System.out.println("sorted using compartor \n"+sorteNames2);

    // 4.distinct() : gives unique elements 
                List<String> uniqueElements = names.stream().distinct().toList();
                System.out.println("distinct example : \n "+uniqueElements);
    
    // 5.limit() : it used to limit the results
               Stream<Integer> nums = Stream.iterate(1, x->x+1)
                                             .limit(10);
                System.out.println("limit example :");
                nums.forEach(System.out::print);
    // 6.skip() : it used to skip some elements 
              Stream<Integer> skipNum = Stream.iterate(1,x->x+1)
                                               .limit(10)
                                               .skip(2);
             System.out.println("skip example :");
             skipNum.forEach(System.out::println);
    
    // 7 peek() - same like does that it is used monitor the elements of stream 
    //same like forEach  it cosumes element does'nt return any elements

            // Stream.iterate(1,x->x+1)
            // .limit(100)
            // .peek(System.out::print).count();

    //  8.flatMap() - > it used to transform data when there are nested structure /'
    // where map fails 
      List<List<String>> fruList = Arrays.asList(
        Arrays.asList("banana","oats"),
        Arrays.asList("dates","snack"),
        Arrays.asList("guava","fiber")
      );

                             fruList.stream()
                            .map(List::stream)
                            .forEach(System.out::println);///this print stream reference not stream 

     System.out.println(fruList.stream().
                                flatMap(x->x.stream()).
                                toList());/// this will print fruits elements 
                            


     List<String> sentences = Arrays.asList("Hello world","Java stream are powerful","flat Map are useful");
    
                System.out.println(sentences.stream()
                .flatMap(s->Arrays.stream(s.split(" ")))//// need to learn again 
                .map(String::toUpperCase)
                .toList());

    
        
    }
}
