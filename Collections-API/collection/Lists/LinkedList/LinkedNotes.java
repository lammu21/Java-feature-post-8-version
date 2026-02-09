package Lists.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

//////Key Points
//Data not Stored Continously 
// memory allocation happens individually 
//faster insertion and deletion
// 1.Better for Insertion and deletion, Since there is no shifting of element like arraylist
// 2.Randoms is slower compare to Arraylist since it is traverse the list from the beginning to reach 
// the desired
// 3.Memory Overhead : LL is requries more memory compare to arraylist
public class LinkedNotes {
public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    System.out.println(linkedList);

    
    linkedList.addFirst(8);//O(1)
    linkedList.addLast(10);//O(1)

    linkedList.get(1);//O(N)
    linkedList.getFirst();//O(1)
    linkedList.getLast();//O(1)

    linkedList.remove(8);//O(1)
    linkedList.remove(0);//O(1)
    linkedList.removeIf(a -> a%2==0);

    // on the fly linkedList creation 
    LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));


}

}






////////Manual LL creation 

//   public static void main(String[] args) {
//     Node head = new Node(1);
//     head.next = new Node(2);
//     head.next.next = new Node (3);
// ////// Traversing Through LinkedList
//     Node tempHead = head;
//     while(tempHead != null)
//     {
//         System.out.print(tempHead.data + "->");
//         tempHead=tempHead.next;
//     }
    
// }
// }
// class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data = data;
//         this.next = null;
//     }
//  }
