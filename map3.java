import java.util.HashMap;

public class map3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(12, 0.5f);
        map.put("1", "one");
        map.forEach((String key, String value) -> {
            System.out.println(key + ":" + value);
        });
    }

}
