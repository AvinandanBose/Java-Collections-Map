import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
public class ConcurrentHashMapMethod_Clone {
    //Clone
    public static void main(String[] args) {
        
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "one");
        map1.put("2", "two");
        map1.put("3", "three");
        map1.put("4", "four");
        map1.put("5", "five");
        map1.put("6", "six");
        map1.put("7", "seven");
        map1.put("8", "eight");
        map1.put("9", "nine");
        map1.put("10", "ten");
       
        System.out.println(" ");
        HashMap<String, String> map2 = (HashMap<String, String>) map1.clone();
       
        ConcurrentHashMap<String, String> map3 = new ConcurrentHashMap<>(map2);
        System.out.println("Map3:" + map3);
        System.out.println(" ");

        //Create a copy of the Map

        ConcurrentHashMap<String, String> map4 = new ConcurrentHashMap<>(map1);
        System.out.println("Map4:" + map4);
        System.out.println(" ");


    }

    
}

/***
 * 
 * Hence we cannot call directly the Clone method on the ConcurrentHashMap class.
 * It belongs to Abstract Map which is not visible to the class.
 * 
 * 
 * 
 */