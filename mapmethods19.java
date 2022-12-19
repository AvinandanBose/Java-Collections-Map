import java.util.HashMap;

public class mapmethods19 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);

        System.out.println(map.compute("f", (
                k, v) -> v + 1));

        System.out.println(map.compute("e", (
                k, v) -> v % 2 == 1 ? v : null));

        System.out.println(map.compute("e", (
                k, v) -> {
            if (v % 2 == 1) {
                return v;
            } else {
                return null;
            }
        }));

    }
}
