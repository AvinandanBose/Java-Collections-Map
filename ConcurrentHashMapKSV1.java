import java.util.concurrent.ConcurrentHashMap;


 public class ConcurrentHashMapKSV1 {

    public static void main(String[] args){
        

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        ConcurrentHashMap.KeySetView<Integer, String> keySetView = map.keySet();

        System.out.println(keySetView);

    }
    
}
