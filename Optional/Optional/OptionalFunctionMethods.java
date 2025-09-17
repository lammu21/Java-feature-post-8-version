package Optional;
// Functional style methods allow transforming and filter optionals

import java.util.Optional;
import java.util.stream.Stream;

// Methods as follows 
// 1. map(Function) : transforms values
// 2.flatMap(function) : transforms values, but avoid nested optional 
// 3.filter(predicate) : Keep value only if condition is true
// 4.ifPresent(Consumer) : runs action if value existing
// 5.ifPresentOrElse(Consumer,Runnable) : run one action if present else another
// ------------------------Java 9 Enchancements -----------------------------------------------------
// 6.or(Supplier) : if value not present, get value from supplier
    //  -> it is lazy fallback 
    // -> if current optional is empty,  then only it call supplier 
// 7. Stream () : Convert optional to Stream ,if value is empty stream returns empty stream 

public class OptionalFunctionMethods 
{
    public static void main(String[] args) {
        
    
    Optional<String> opt = Optional.of("java");
    // ------map--------
    //   Syn : opt.map(Function)
    System.out.println(opt.map(String::toUpperCase));

    // -----flatMap-----
    //   Syn : opt.flatMap(Function)
    System.out.println(opt.flatMap(s -> Optional.of(s.length())));

    // ----filter-------
    //   Syn:opt.filter(predicate)

    System.out.println(opt.filter(s->s.startsWith("j")));

    System.out.println(opt.filter(s->s.startsWith("s")));

      // real-time example
    // String dbUrl =config.Service.getDbUrl()
    //                     .filter(url -> url.startsWith("jdbc:"))
    //                     .orElse("jdbc:mysql://localhost:3306/default");


    // ----ifPresent----
    // syn : opt.ifPresent(value -> {....})
     opt.ifPresent((val) -> System.out.println("value  :"+ val));


    
    // -----ifPresentOrElse()---
     // SYN: opt.ifPresentOrElse(value -> {....},()->{....})
    opt.ifPresentOrElse((val) -> System.out.println("value " +val),() -> System.out.println("value is not present"));


    // -----or() ----
    // SYN : opt.or(()-> optional.of(fallback));
    Optional<String> empty = Optional.empty();
    Optional<String> Noempty = Optional.of("Java");

    String result = empty.or(()-> Optional.of("fallback"))
                                          .get();

    System.out.println("result :"+ result);

    String result2 = Noempty.or(()-> Optional.of("fallback")).get();

    System.out.println("result2 :"+ result2);

    // Real world example

    // suppose we need look for user in cacher first, if not found then look in DB 
    // Optional<User> user = findUserInCacher()
    //                       .or(()->findUserinDB());


    // -----stream() ----
    // SYN : opt.stream()
    Optional <String> opt1 = Optional.of("java");

    opt1.stream().forEach(System.out::println);
    }
}
