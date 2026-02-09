 List interface are 
 ordererd and 
 allow duplicates, 
 elements can be accessed using index
 Can traversed bidirectional using Listiterator

Classes implements list -> 
ArrayList, 
LinkedList,
Vector,
Stack


Operation of List Interface:
1. Adding Elements 

    .add(element) ; used add elements in list at the end 
                List<String> names = new ArrayList<>();
                names.add("saiteja");
                names.add("Nirmala");
                names.add("Mallaiah");


    .add(index,element) : used add elements in list at specific index    
                names.add(3,"saiChandu");

 Time Comple  : O(1)
 Space Comple ; O(N)
-------------------------------------------------------------------
2. Updating Elements 

    .set(index,element) : update element at specific index 
                names.set(2,"Malli");
-------------------------------------------------------------------
3. Searching Element 

    .indexOf(Element) : gives first occurence of index
               names.indexOf(2); 


    .lastIndex(Element) : gives last occurence of index
              names.lastIndex(1);
-------------------------------------------------------------------
4. Removing Elements
   remove(element) : removes elements from the list 
                   names.remove("saiteja");


   remove(index) : removes elements from specific list and shifts remaining elements to left side of array 
                   names.remove(2);
  Time Complexity : O(N)
  Space Complexit : o(1)

-------------------------------------------------------------------
5. Accessing Elements : 
    .get(element) : it will return specific index 
                names.get("saiteja);


    .get(index) : it will return specific element at that index
                 names.get(2);

-------------------------------------------------------------------
6. Check if Element is Present or not :
   .contains() : it will return true if element is present 
                names.contains("lamm");
            
7. iterating through loop : 
   for: basic for loop 

   Enchanced for Loop : 
          for(String name : names)
          {
            System.out.println(name);
          }

