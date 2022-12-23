import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

public class synchronizedIdentityHashMap {
    public static void main(String[] args) throws Exception {

        Thread thread = new Thread();

        Map<String, Integer> map = Collections.synchronizedMap(new IdentityHashMap<>());
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println(map);

        Map<String, Integer> map1 = new IdentityHashMap<>();
        thread.start();
        Thread.sleep(1000);
        synchronized (map1) {
            map1.put("a", 1);
            map1.put("b", 2);
            map1.put("c", 3);
            map1.put("d", 4);
            map1.put("e", 5);
            map1.put("f", 6);
            System.out.println(map1);
        }
        thread.stop();

    }
    
}
