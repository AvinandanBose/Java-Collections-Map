
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class TreeMap4 {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");

        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        treeMap.put(4, "four");
        treeMap.put(5, "five");
        treeMap.put(6, "six");
        treeMap.put(7, "seven");
        System.out.println(treeMap);
    }
}
   
