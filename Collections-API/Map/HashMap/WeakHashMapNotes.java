package Map.HashMap;

import java.util.WeakHashMap;

// HashMap with weak reference is know as weakHashMap
// mainly used in caching the data 
public class WeakHashMapNotes {
    public static void main(String[] args) 
    {
       WeakHashMap<Integer,String> weakHashMap = new WeakHashMap<>();

       weakHashMap.put(1,"sai");
       weakHashMap.put(2,"lammu");
       System.out.println(weakHashMap);
       System.gc();

       try{
        Thread.sleep(100000);
       }
       catch(Exception e){

       }

       System.out.println(weakHashMap);
     }
}
