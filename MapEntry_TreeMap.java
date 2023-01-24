import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class MapEntry_TreeMap {
    public static void main(String[] args) throws Exception {
        // Map.Entry
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println("Map:" + map);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }

        System.out.println(" ");
        Set<Entry<String, Integer>> set1 = map.entrySet();
        for (Entry<String, Integer> entry : set1) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }

        System.out.println(" ");

        //firstEntry
        Entry<String, Integer> firstEntry = map.firstEntry();
        System.out.println("First Entry:" + firstEntry.getKey() + " " + firstEntry.getValue());

        //lastEntry

        Entry<String, Integer> lastEntry = map.lastEntry();
        System.out.println("Last Entry:" + lastEntry.getKey() + " " + lastEntry.getValue());

        //lowerEntry
        Entry<String, Integer> lowerEntry = map.lowerEntry("c");
        System.out.println("Lower Entry:" + lowerEntry.getKey() + " " + lowerEntry.getValue());

        //higherEntry
        Entry<String, Integer> higherEntry = map.higherEntry("c");
        System.out.println("Higher Entry:" + higherEntry.getKey() + " " + higherEntry.getValue());

        //floorEntry
        Entry<String, Integer> floorEntry = map.floorEntry("c");
        System.out.println("Floor Entry:" + floorEntry.getKey() + " " + floorEntry.getValue());

        //ceilingEntry
        Entry<String, Integer> ceilingEntry = map.ceilingEntry("c");
        System.out.println("Ceiling Entry:" + ceilingEntry.getKey() + " " + ceilingEntry.getValue());

        //pollFirstEntry
        Entry<String, Integer> pollFirstEntry = map.pollFirstEntry();
        System.out.println("Poll First Entry:" + pollFirstEntry.getKey() + " " + pollFirstEntry.getValue());

        //pollLastEntry
        Entry<String, Integer> pollLastEntry = map.pollLastEntry();
        System.out.println("Poll Last Entry:" + pollLastEntry.getKey() + " " + pollLastEntry.getValue());

      


    }
    
}
