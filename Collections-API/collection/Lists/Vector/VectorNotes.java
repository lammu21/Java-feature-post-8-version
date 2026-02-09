package Lists.Vector;

import java.util.Vector;

//Sychronized Thread-Safe
//same as arraylist all other features
//here i am using methods which are not in Arraylist
public class VectorNotes {
    
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());//Initial Capcity is 10, capcity increase  x2.
        vector.add(1);
        System.out.println(vector.capacity());
        Vector <Integer> vector1 = new Vector<>(5,3);
        // along with capacity we can also give how many times vector size increase
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());

        

    }
}
