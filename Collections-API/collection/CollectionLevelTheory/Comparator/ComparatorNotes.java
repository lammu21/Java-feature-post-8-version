package CollectionLevelTheory.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Comparator is used do custom order 
// Basically Comparator take two Object of same type compares

public class ComparatorNotes {
    public static void main(String[] args) {
        
    ///number example 
    ArrayList <Integer> numList = new ArrayList<>();
    for(int i = 0 ; i < 10 ; i++)
    {
        numList.add(i);

    }
    numList.sort(null);
    System.out.println("Normal Sorting\n" +numList);
    numList.sort(new IntegerComparator());
    System.out.println("My Custom Sorting\n" +numList);


    // String Example 

    List<String> stringList = Arrays.asList("Orange","Date","Banana", "Apple");
    stringList.sort(null);
    System.out.println("Normal Sorting\n" + stringList);
    stringList.sort(new StringComparator());
    System.out.println("My Custom String Sorting\n" + stringList);


    // Comparator using lambda Expression
    stringList.sort((a,b) -> a.length() - b.length());
    System.out.println("Lambda Custom Comparator\n" + stringList);



    /// Custom Object 
    ArrayList <Student> students = new ArrayList<>();
 
    students.add(new Student("amruth", 3.9));
    students.add(new Student("bob", 3.8));
    students.add(new Student("charan", 3.4));
    students.add(new Student("amul", 3.2));
    students.add(new Student("charm", 3.2));

    // students.sort(null);/// this won't work cause there is no default Comparator for Custom Objects

    students.sort((a,b) -> {
        if(a.getGpa() - b.getGpa() < 0)
            return 1;
        else if (a.getGpa() - b.getGpa() > 0)
            return -1;
        else {
            return a.getName().compareTo(b.getName());//comparing name
        }
    });
    System.out.println("----Not using Comparaing Function----");
    for (Student student : students) {
        System.out.println(student.getName()+" "+ student.getGpa());
    }

    Comparator<Student> comparator =  Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
    students.sort(comparator);

     System.out.println("---- using Comparaing Function----");
     for (Student student : students) {
        System.out.println(student.getName()+" "+ student.getGpa());
    }



 }

static class IntegerComparator implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2){
         return o2 - o1;
    }
}

static class StringComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

static class Student
{
    private String name;

    private Double gpa;

    public Student(String name,Double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }
}



}
