package Lists.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
 public static void main(String[] args) {
	
 
	// copy on write means whenever a write operation happens instead of directly modifying original list, 
	// new copy of list created and modifications done on copy of list, then original will be updated later with copy list..
	// this is to ensure that other threads reading the list while modification going on With other modification affects

	// used on ready more use cases 



	// why copyonWriteArrayList needed explaining using Arraylist
	 List <Integer> arrayList = new ArrayList<>();
	 arrayList.add(1);
	 arrayList.add(2);
	 arrayList.add(3);
	 arrayList.add(4);

	//  for(Integer num : arrayList)
	//  {
	// 	System.out.println(num);

	// 	if(num == 2)
	// 	{
	// 		arrayList.add(6);
	// 		System.out.println("added 6 whiles reading ");
	// 	}
	//  }
//  with arrayList getting "Exception in thread "main" java.util.ConcurrentModificationException"

// with CopyOnWriteArrayList
System.out.println("with CopyOnWriteArrayList");
List <Integer> arrayList1 = new CopyOnWriteArrayList<>();

     arrayList1.add(1);
	 arrayList1.add(2);
	 arrayList1.add(3);
	 arrayList1.add(4);

	 for(Integer num : arrayList1)
	 {
		System.out.println(num);

		if(num == 2)
		{
			arrayList1.add(6);
			System.out.println("added 6 while reading ");
		}
	 }

	 System.out.println("Updated arraylist after write copy is added to original list " +arrayList1);




    
}
}
