import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

	// •	A Functional Interface is an interface that has exactly one abstract method (SAM: Single Abstract Method).
	// •	It can have multiple default and static methods.
	// •	Marked with @FunctionalInterface (optional but recommended).

interface A {
    void show();
}

interface B
{
    int add(int i, int j);
}

public class FunctionalInterfaceLearning {
    public static void main(String[] args)
    {

        // Abstract class implementation
        A obj = new A ()
        {
        public  void show()
            {
                System.out.println("in Show()");
            }
        };

    // // 1. Predicate<T> -> boolean test(T t)
    //     Predicate<Integer> isEven = n -> n % 2 == 0;
    //     System.out.println("Predicate (isEven 10): " + isEven.test(10)); // true

    //     // 2. Function<T,R> -> R apply(T t)
    //     Function<String, Integer> lengthFunc = str -> str.length();
    //     System.out.println("Function (length of 'Java'): " + lengthFunc.apply("Java")); // 4

    //     // 3. Consumer<T> -> void accept(T t)
    //     Consumer<String> printer = msg -> System.out.println("Consumer: " + msg);
    //     printer.accept("Hello Infosys"); // Consumer: Hello Infosys

    //     // 4. Supplier<T> -> T get()
    //     Supplier<Double> randomSupplier = () -> Math.random();
    //     System.out.println("Supplier (random number): " + randomSupplier.get());

    //     // 5. BiFunction<T,U,R> -> R apply(T t, U u)
    //     BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
    //     System.out.println("BiFunction (5 + 7): " + add.apply(5, 7)); // 12

    //     // 6. UnaryOperator<T> -> T apply(T t)
    //     UnaryOperator<String> upper = str -> str.toUpperCase();
    //     System.out.println("UnaryOperator (java -> JAVA): " + upper.apply("java"));

    //     // 7. BinaryOperator<T> -> T apply(T t1, T t2)
    //     BinaryOperator<Integer> multiply = (a, b) -> a * b;
    //     System.out.println("BinaryOperator (3 * 4): " + multiply.apply(3, 4)); // 12
    
      

//    Lambda expression 
    A obj1 = () -> System.out.println("In lambda Show()");

    obj.show();
    obj1.show();



// Lambda expression with parameters
    B obj2 = (i,j) ->  i+j;

    System.out.println(obj2.add(1, 2));
  }
}
