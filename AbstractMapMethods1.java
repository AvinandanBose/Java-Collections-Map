import java.util.HashMap;
public class AbstractMapMethods1 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("d", 4);
        map1.put("e", 5);
        map1.put("f", 6);
        Boolean b = map.equals(map1);
        System.out.println("Equals:" + b);
        Boolean c = map1.entrySet().equals(map.entrySet()); 
        System.out.println("Equals:" + c);
    }
    
}
