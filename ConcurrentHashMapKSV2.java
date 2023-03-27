import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapKSV2 {

    public static void main(String[] args){
        

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        KeySetView<Integer, String> keySetView = map.keySet();

        System.out.println(keySetView);}
    
}
