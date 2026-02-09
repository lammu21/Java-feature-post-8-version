package Map.HashMap;

import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapNotes {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
// java 7 -> Segment based locking happened for concurrentHashMap -> ConcHashMap is Divided into 16 small segements 
// that specific segment locked 
// JAVA 8 ->  No segment
// Compare and Swap if no resizing or collions 
// 


    }
}
