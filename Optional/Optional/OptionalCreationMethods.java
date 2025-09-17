package Optional;

import java.util.Optional;

// Optional is a container that may be hold non null value or be empty
// It mainly used or introduced to avoid nullpointerExceptions

// Optional can be Created in 3 ways
// Syntax:
// 1. Optional<T> opt1 = Optional.of(value)         ----> used for non Null value only, 
                                                     // Throws nullpointerException
// 2.Optional<T> opt2 = Optional.ofNullable(value)  ---> used for values that can be null as well,
                                                    //  return Optional Container if value is null
// 3.Optional<T> opt3 = Optional.empty();           ---> Represent no value

// example
public class OptionalCreationMethods 
{

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Java");
        Optional<String> opt2 = Optional.ofNullable(null);
        Optional<String> opt3 = Optional.empty();

        System.out.println("---Optional.of example---\n" + opt1);
        System.out.println("---Optional.ofNullable example---\n" + opt2);
        System.out.println("---Optional.empty example---\n" + opt3);
    }

// RealTime example
//   Used in repository Methods
// Optional <user> userOptional = UserRepository.findById(123);
// •	Optional.empty() is returned if no user found.


    
}
