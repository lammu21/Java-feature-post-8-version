package Lists.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// ArrayList is not Threadsafe to make it threadsafe wrap it up with Collection.synchronizedList()


public class ArratListNotes {

       public static void main(String[] args) {

//Youtube Class
       ArrayList <Integer> arrayList = new ArrayList<>();
       arrayList.add(1);
       arrayList.add(4);
       arrayList.add(2);
       arrayList.add(3);
// adding at index 
      arrayList.add(0,0);


/// traversal methods
/// Enchance for loop
      for(Integer a : arrayList)
       {
              // System.out.print(a);
       }
///iterator
       Iterator <Integer> it = arrayList.iterator();
       while (it.hasNext())
       {
              System.out.print(it.next());
       }
////// for Each Loop
       arrayList.stream().forEach(System.out::println);

/// ///set methods
       arrayList.set(2,2);

///////// creation methods 
       List <Integer> listOfArray = Arrays.asList(1,2,3,4);

       //listOfArray.add(2);/// we cannot add element when we create List using Array.asList()
       //listOfArray.add(1,2); // we can update the list /// we cannot update as well
///////// List.of() Creation method 
       List<Integer> aslist = List.of(1,2,4,5); //we can add or Update the list

//i///////if we want modify List.of() or Arrays.asList() lists can be done follows
       ArrayList <Integer> arrayList2 = new ArrayList<>(aslist);
       arrayList2.add(565);
////////////////////Sorting Methods
       arrayList.sort(null);
       System.out.println(arrayList);

////////////// Time Complexity 
/// to access the element O(1)
/// to add element O(N)
/// to remove Element O(N)
/// to Traverse List O(N)

    













///////////// from GFG Readings////////////////////////////////////
/// 
       // List withOutObjType = new ArrayList<>();     // Can be declared without Type of Objects 
       // List<Integer> withObjType = new ArrayList<>();// declared with object types
       // List<Student> students = new ArrayList<>();//can declared with custom Objects as well
       // List<String> fruits = new ArrayList<>();// we can add ArrayList elements using another collections elements as well 
       // Student s1 = new Student(1,"Sai");// if you want add custom objects you need create Custom objects first 
       // students.add(s1);
       // students.add(new Student(1,"Teja"));// Other way : Creating Obj While Add Element to the List 
       // System.out.println("------Direct Way---- ");
       // System.out.println(students);
       // System.out.println("------Using Enchanced For ---- "); // Enchanced For Loop
       // for(Student student : students)
       // {
       // System.out.println(student.toString());
       // }
       // System.out.println("------Using  ForEach ---- ");// ForEach using Stream 
       // students.stream().forEach(System.out::println);
       // System.out.println("------Using  iterator ---- "); //using iterator 
       // Iterator <Student> iterator = students.iterator();
       // while (iterator.hasNext())
       // {
       // System.out.println(iterator.next());    
       // }
       // // Need to Learn Later
       // //  String studentList = students.stream().collect(Collectors.joining(", "));
}
   static class Student{
        int rollNum;
        String Name;

    

        public Student(int rollNum,String Name){
        this.rollNum = rollNum;
        this.Name = Name;
        
        }

        public String toString()
        {

            return "Stundent{rollno :" + rollNum + " Name :" +Name;
        }

        
    }            
}