
import java.util.HashMap;

public class map2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(12);
        map.put("1", "one");
        map.forEach((String key, String value) -> {
            System.out.println(key + ":" + value);
        });
    }
    
}
