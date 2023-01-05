
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.NavigableMap;
import java.util.TreeMap;
public class TreeMap6 {
    public static void main(String[] args) throws Exception {
        NavigableMap<Integer, String> navigableMap = new ConcurrentSkipListMap<>();

        navigableMap.put(1, "one");
        navigableMap.put(2, "two");
        navigableMap.put(3, "three");
        navigableMap.put(4, "four");
        navigableMap.put(5, "five");

        TreeMap<Integer, String> treeMap = new TreeMap<>(navigableMap);
        System.out.println(treeMap);

        treeMap.put(4, "four");
        treeMap.put(5, "five");
        treeMap.put(6, "six");
        treeMap.put(7, "seven");
        System.out.println(treeMap);

    }
    
}
