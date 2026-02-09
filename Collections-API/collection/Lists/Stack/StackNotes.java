package Lists.Stack;

import java.util.LinkedList;
import java.util.Stack;

// LIFO - Last in First Out 
// java collections stack extents vector, i will also have methods which vector have

public class StackNotes {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.peek();
        stack.isEmpty();
        stack.search(4);//return 2, 
        // search will search element from top of stack
        // search is 1 based indexing

        
        
        // Using linkedlist we can create stack
        LinkedList <Integer> linkedListStack = new LinkedList<>();

        linkedListStack.addLast(5);
        linkedListStack.addLast(4);
        linkedListStack.addLast(3);
        linkedListStack.addLast(2);
        linkedListStack.addLast(1);//push

        linkedListStack.removeLast();//pop()
        linkedListStack.getLast();//peek
        linkedListStack.isEmpty();
        linkedListStack.size();
        System.out.println(linkedListStack.indexOf(4));

        
    }
    
}
