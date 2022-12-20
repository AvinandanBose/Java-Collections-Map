import java.util.HashMap;
public class AbstractMapMethods2 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println(map.toString());
        String s = map.toString();
        System.out.println(s);
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());
    }
}
