package Map.HashMap;

import java.util.*;

public class IdentityHashMapNotes {
 public static void main(String[] args) {
    
 
    String key = new String("key");
    String key2 = new String("key");
    Map<String, Integer> map = new HashMap<>();
    map.put(key,1); 
    map.put(key2,2);/// normal will update the key -> 2 since it same key 
    System.out.println(map);

    Map<String,Integer> identityHashMap = new IdentityHashMap<>();
    identityHashMap.put(key,1);
    identityHashMap.put(key2,2); /// identityHashMap will not update the key ->2 
    // HashMap uses HashCode method of identityHashMap not String or Object class HashCode method

    System.out.println(identityHashMap);

 
    }
    
    

    
}
