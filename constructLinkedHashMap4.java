import java.util.LinkedHashMap;
public class constructLinkedHashMap4 {
    public static void main(String[] args) throws Exception {
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(map1);
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println(map);
                          
    }
}
