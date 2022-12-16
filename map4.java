import java.util.HashMap;
import java.util.Map;

public class map4 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        HashMap<String, String> map = new HashMap<>(map1);
        map.put("1", "one");
        map.forEach((String key, String value) -> {
            System.out.println(key + ":" + value);
        });
    }
}
