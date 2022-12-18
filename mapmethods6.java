
import java.util.HashMap;
public class mapmethods6 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        int val = map.get("One");
        System.out.println(map.get("One"));
        System.out.println(val);
       

    }
}
