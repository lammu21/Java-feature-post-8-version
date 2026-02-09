package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
// Unordered
// Allow null keys and Values : Can have one Null key and mutiple null values 
// Not Synchronized : Not Thread safe in multiThread Context
// Performace : o(1) for get(),put() on assumption of hash function disperses elements properly
////////  HashMap internall struture and working //////////
        // key : identifier used to get value 
        // value : data associated with Key
        // bucket : Cells or partions in a list (Arraylist)
        // Hash Function : Converts a key into an index for storage (Bucket Location )

        // hash function takes key (user key ) and convert it into fixed size string byte which is numeric value 
        // known as hash code,,,
        // main perupose of hash code is maintain fixed size key hash values  
        // Same input key will give same output
        // hash function computes hash code quickly 

// Steps in hash Function Calculation 
        // Step 1 : Hashing the Key
        // Hash code will used to calculate index value for key- value pair
        // Step 2 : calculating the index 
        // int index = hashcode % arraySize
        // index will decide which bucket will hold this key - value pair 
        // Step 3 : Key value pair is stored in the bucket,
        // Each bucket can stored mutiple key value pairs (this is know as collions)

//// How Hash Function retrieves Data
        //Hashing the key : when call get() function hash key calculated 
        //finding the index : using hash code is used to find the index of the bucket.
        // Searching in the bucket : Once bucket is found it, check for key, if key is present associated value will be return  


        //  before java 8 when collions happens same hashcode key-value get stored using 'linkedin list'
        // after java 8 same hashcode key values stored as 'Balanced Binary Serach' (Red Black Tree )


///// HashMap Resizing (rehashing)
       /// HashMap Internal array size default value 16, when key value paire increased 75% of overall size, 
       // hashMap resizes its array size automatically 
       // default size is 16 when more than 12 elements inserted the HashMap will resize it's array Size
       // Once Hash's internal arrays sized is double, all the existing values rehased and placed into new array 



////////// Time Complexity 
      //Basic Operations get(),put(), remove(),contains(key),size() will take O(1) Assuming no Collisions 
      // collision happens it will take O(log N), After java 8 before it was O(N)
      /// contains(value) - > O(N).ff
      /// 
      /// Every Object implements Object Class 
      /// Object class have hash code  and equals() methods

public class HashMapNotes
{
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap(12,0.5f); // we can give initial capacity and loading factor or how much size it should size 

        hashMap.put(1,"sai");
        hashMap.put(2,"Teja");
        hashMap.put(3,"Lammu");

        System.out.println(hashMap);

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("Lammu"));


        //// traversing through map
        System.out.println("Traversing hashMap using keySet() method  " ); 
        for(int i : hashMap.keySet())
        {
            System.out.println(hashMap.get(i)); 
        }

        System.out.println("Traversing hashMap using entrySet() method " );

            for (Map.Entry<Integer,String> entrySet : hashMap.entrySet())
            {
            System.out.println(entrySet.getValue() +" "+ entrySet.getKey());
            }

            for (Map.Entry<Integer,String> entrySet : hashMap.entrySet())
            {
            System.out.println(entrySet.getValue().toUpperCase() +" "+ entrySet.getKey());
            }


            hashMap.remove(1);
            System.out.println(hashMap);
            hashMap.remove(2,"Teja");
            System.out.println(hashMap);   


     //// Example 
            HashMap<Person, String> map = new HashMap<>();

            
            Person p1 = new Person("sai", 1);
            Person p2 = new Person("lammu", 2);
            Person p3 = new Person("sai", 1);

            //hashcode for objects generated based memory or something so 
            map.put(p1, "Software"); /// hashcode1 --> index1
            map.put(p2, "dev"); /// hashcode2 --> index2
            map.put(p3, "Senior Software");/// hashcode3 --> index3 ///  here value won't get updated 


            //// hashcode for internal Datatypes like String and Integer are different 
            Map<String, Integer> map2 = new HashMap<>();
            map2.put("Sai", 2);// /// hashcode1 --> index1
            map2.put("teja", 3);////// hashcode2 --> index2
            map2.put("Sai", 4);/// /// hashcode1 --> index1 here value get updated 

            for(Map.Entry<Person,String> entryset : map.entrySet()){
                System.out.println(entryset.getValue());
            }

           


        
    }

            public static class Person 
            {
            private String name;
            private int id;

            public Person(String name, int id) {
                this.name = name;
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public int getId() {
                return id;
            }

                
            }
}
