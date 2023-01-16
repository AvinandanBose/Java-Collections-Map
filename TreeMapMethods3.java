import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class TreeMapMethods3 {
    public static void main(String[] args) throws Exception {

        TreeMap<Float, String> treeMap = new TreeMap<>();

        treeMap.put(1.09f, "A");
        treeMap.put(2.93f, "B");
        treeMap.put(3.98f, "C");
        treeMap.put(4.78f, "D");
        // ceilingEntry
        System.out.println("Ceiling Entry: " + treeMap.ceilingEntry(3.0f));
        System.out.println("Ceiling Entry: " + treeMap.ceilingEntry(3.2f));
        System.out.println("Ceiling Entry: " + treeMap.ceilingEntry(3.99f));

        System.out.println("");
        // ceilingKey
        System.out.println("Ceiling Key: " + treeMap.ceilingKey(3.0f));
        System.out.println("Ceiling Key: " + treeMap.ceilingKey(3.2f));
        System.out.println("Ceiling Key: " + treeMap.ceilingKey(3.99f));

        System.out.println("");

        // descendingKeySet
        Set<Float> set = treeMap.descendingKeySet();
        System.out.println("Descending Key Set: " + set);

        System.out.println("");

        // descendingMap
        Map<Float, String> Map = treeMap.descendingMap();

        System.out.println("Descending Map: " + Map);

        // firstEntry
        Map.Entry<Float, String> Map1 = treeMap.firstEntry(); 
        System.out.println("First Entry: " + Map1);

        // floorEntry

        Entry<Float, String> Map2 = treeMap.floorEntry(3.0f); 
        System.out.println("Floor Entry: " + Map2);

        // floorKey
        Float Map3floorKey = treeMap.floorKey(3.0f);
        System.out.println("Floor Key: " + Map3floorKey);
        System.out.println("");

        //headMap(K toKey, boolean inclusive)
        Map<Float, String> Map4 = treeMap.headMap(3.0f, true); 
        System.out.println("Head Map: " + Map4);
        System.out.println("");

        //higherEntry
        Entry<Float, String> Map5 = treeMap.higherEntry(4.0f);
        System.out.println("Higher Entry: " + Map5);

        //higherKey
        Float Map6 = treeMap.higherKey(4.0f);
        System.out.println("Higher Key: " + Map6);
        System.out.println("");

        // lastEntry
        Entry<Float, String> Map7 = treeMap.lastEntry();
        System.out.println("Higher Key: " + Map7);
        System.out.println("");

        // lowerEntry
        Entry<Float, String> Map8 = treeMap.lowerEntry(4.0f); 
        System.out.println("Lower Entry: " + Map8);
        System.out.println("");
        Map.Entry<Float, String> Map9 = treeMap.lowerEntry(4.0f);
        System.out.println("Lower Entry: " + Map9);
        System.out.println("");

        //lowerKey
        Float Map10 = treeMap.lowerKey(4.0f);
        System.out.println("Lower Key: " + Map10);
        System.out.println("");

        //navigableKeySet

        Set<Float> set1 = treeMap.navigableKeySet();
        System.out.println("Navigable Key Set: " + set1);
        System.out.println("");
      
        //pollFirstEntry
        Entry<Float, String> Map11 = treeMap.pollFirstEntry();
        System.out.println("Poll First Entry: " + Map11);
        System.out.println("");


        //pollLastEntry

        Entry<Float, String> Map12 = treeMap.pollLastEntry();
        System.out.println("Poll Last Entry: " + Map12);
        System.out.println("");

        // SubMap( fromKey:Key, boolean fromInclusive:true/false, toKey:Key, boolean
        // toInclusive:true/false)

        Map<Float, String> Map13 = treeMap.subMap(1.0f, true, 4.0f, true);
        System.out.println("Sub Map: " + Map13);
        System.out.println("");
        
        // tailMap(fromKey :Key, boolean inclusive: true/false)

        Map<Float, String> Map14 = treeMap.tailMap(3.0f, true);
        System.out.println("Tail Map: " + Map14);
        System.out.println("");
       

    }

}
