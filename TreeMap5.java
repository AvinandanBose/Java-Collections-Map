import java.util.concurrent.ConcurrentSkipListMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap5 {
    public static void main(String[] args) throws Exception {
        SortedMap<Integer, String> sortedMap = new ConcurrentSkipListMap<>();

        sortedMap.put(1, "one");
        sortedMap.put(2, "two");
        sortedMap.put(3, "three");
        sortedMap.put(4, "four");
        sortedMap.put(5, "five");

        TreeMap<Integer, String> treeMap = new TreeMap<>(sortedMap);
        System.out.println(treeMap);

        treeMap.put(4, "four");
        treeMap.put(5, "five");
        treeMap.put(6, "six");
        treeMap.put(7, "seven");
        System.out.println(treeMap);

    }
}
