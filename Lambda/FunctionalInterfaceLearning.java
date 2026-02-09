import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

// •	A Functional Interface is an interface that has exactly one abstract method (SAM: Single Abstract Method).
// •	It can have multiple default and statiPc methods.
// •	Marked with @FunctionalInterface (optional but recommended).

interface A {
    void show();
}

interface B {
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
                // System.out.println("in Show()");
            }
        };

// 1. ------------  Predicate ----------
// is function which has only one Abstract method in it test() and return true and false based on operation.
// if there situation where you need to check the some Condition use Predicate
// Syntax 
// Predicate<T> -> boolean test(T t)

            Predicate<Integer> isEven = n -> n % 2 == 0;
            // System.out.println("Predicate (isEven 10): " + isEven.test(10)); // true

            Predicate<String> isStartWithA = x->x.toLowerCase().startsWith("A");
            // System.out.println(isStartWithA.test("Sai"));
            

            Predicate<Integer> isOdd = x -> x % 2 ==1;
            // System.out.println(isOdd.test(9));

            

        
// 2. ---------Function-------------
// Function is Functional Interface which has only one Abstract method which is take specific type inputs and return specificed type output
//syntax : Funtion <T,R> -> R apply(T t) Function < InputType, ReturnType> FunctionName = x -> s.length()
// 
            Function<String, Integer> lengthFunc = str -> str.length();
            // System.out.println("Function (length of 'Java'): " + lengthFunc.apply("Java")); // 4

            Function<Integer,Integer> doubleIt = x->x*2;


            Function<Integer,Integer> tripleIt = x-> x*3;
            // System.out.println(tripleIt.apply(21));

// .compose() - > if there 2 operation first applies second (doubleIt) applied function then first function (tripleIt)
            // System.out.println(tripleIt.compose(doubleIt).apply(31));

// 3. ----------Consumer------------ 
// Consumer will take something and returns nothing
// Consumer<T> -> void accept(T t)
            Consumer<String> printer = msg -> System.out.println("Consumer: " + msg);
            // printer.accept("Hello Infosys"); // Consumer: Hello Infosys

            Consumer<String> message = msg -> System.out.println("CosumerExample " +msg);
            message.accept("hi");

// 4. Supplier<T> -> T get()
// it won't Cosume Anything return Something
            Supplier<Double> randomSupplier = () -> Math.random();
            // System.out.println("Supplier (random number): " + randomSupplier.get());

            // 5. BiFunction<T,U,R> -> R apply(T t, U u)
            BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
            // System.out.println("BiFunction (5 + 7): " + add.apply(5, 7)); // 12

            // 6. UnaryOperator<T> -> T apply(T t)
            UnaryOperator<String> upper = str -> str.toUpperCase();
            // System.out.println("UnaryOperator (java -> JAVA): " + upper.apply("java"));

            // 7. BinaryOperator<T> -> T apply(T t1, T t2)
            BinaryOperator<Integer> multiply = (a, b) -> a * b;
            // System.out.println("BinaryOperator (3 * 4): " + multiply.apply(3, 4)); // 12
        
      

//    Lambda expression 
    // A obj1 = () -> System.out.println("In lambda Show()");

    obj.show();
    // obj1.show();



// Lambda expression with parameters
    B obj2 = (i,j) ->  i+j;

    // System.out.println(obj2.add(1, 2));
  }
}
