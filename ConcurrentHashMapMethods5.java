import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods5 {
    public static void main(String[] args) throws Exception {
        
     

        // newKeySet
       Set<String> keySet = ConcurrentHashMap.newKeySet();
       keySet.add("one");
       keySet.add("two");
       keySet.add("three");
       keySet.add("four");
       System.out.println("KeySet:" + keySet);
      
        
    }
    
}
