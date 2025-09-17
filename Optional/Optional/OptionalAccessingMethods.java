package Optional;
// ---------Optional Accessing values methods------
// 1.isPresent() -> Check if value Exists
// 2. isEmpty() -> check if value is empty, Opposite to isPresent(java 11 +)
// 3. get()     -> retrieve values,unsafe if empty
// 4.orElse(defaultvalue) -> return or defaultvalue
// 5.orElseGet(supplier) -> return value or lazy defaultvalue
// 6.orElseThrow(supplier) -> throw exception if empty

import java.util.Optional;

public class OptionalAccessingMethods {
    public static void main(String[] args) {

        Optional<String> opt1 = Optional.of("Spring");
        Optional<String> opt2 = Optional.empty();

        // ---isPresent() & get()--
        // Syntax : boolean present = opt.isPresent();
        // example:
        if(opt1.isPresent())
        {
            System.out.println("---isPresent() && get() method example ---\n"+opt1.get());
        }

        //  ---orElse(defaultvalue)---
        // Syntax : <T> value = opt.orElse(defaultvalue);
        // example:

        System.out.println(opt2.orElse("---orElse example---\n default value"));

        // ----orElseGet(supplier)-----
        // Syntax : <T> value = opt.orElseGet(() -> value);
        // example:
        System.out.println(opt2.orElseGet(()->"---orElseGet example---\n lazy default value"));

        // ------orElseThrow(supplier)---
        // Syntax : <T> value = opt.orElseThrow(() -> new exception("not found"))

        try 
        {
            System.out.println("---orElseThrow()---");
            System.out.println(opt2.orElseThrow(() -> new RuntimeException()));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
// RealTime example
//  in Service layer
//  String email = UserRepository.findbyId(123)
//                               .map(user :: getEmail).orElse("no-Email@example.com");
        
    }
    
    

}
