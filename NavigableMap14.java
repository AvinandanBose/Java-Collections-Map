import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Iterator;

public class NavigableMap14 {
    // navigableKeySet
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f, 11);
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("navigableKeySet:" + map.navigableKeySet());

        // Similar way of descendingKeySet , navigableKeySet supports all the methods of
        // Set
        System.out.println("navigableKeySet:" + map.navigableKeySet().pollFirst());
        System.out.println("navigableKeySet:" + map.navigableKeySet().pollLast());
        System.out.println("navigableKeySet:" + map.navigableKeySet().descendingSet());
        System.out.println("navigableKeySet:" + map.navigableKeySet().headSet(3.4f));
        System.out.println("navigableKeySet:" + map.navigableKeySet().tailSet(3.4f));
        System.out.println("navigableKeySet:" + map.navigableKeySet().subSet(3.4f, 5.6f));
        System.out.println("navigableKeySet:" + map.navigableKeySet().subSet(3.4f, true, 5.6f, true));
        System.out.println("navigableKeySet:" + map.navigableKeySet().subSet(3.4f, false, 5.6f, false));

        // Iterator
        Iterator<Float> iterator = map.navigableKeySet().iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator:" + iterator.next());
        }

        // remove
        map.navigableKeySet().remove(3.4f);
        System.out.println("Map:" + map);

        // removeAll
        map.navigableKeySet().removeAll(map.navigableKeySet().subSet(4.3f, 5.6f));
        System.out.println("Map:" + map);
        // retainAll
        map.navigableKeySet().retainAll(map.navigableKeySet().subSet(2.6f, 5.6f));
        System.out.println("Map:" + map);
        // clear
        map.navigableKeySet().clear();
        System.out.println("Map:" + map);

        // ...and so on
        // Except it doesnot Support add() method and addAll() method
        /*
         * Not Supported
         * ---------------
         * System.out.println("Descending Key Set:" + map.navigableKeySet().add(1.8f));
         * System.out.println("Descending Key Set:" + map.navigableKeySet().addAll(map.descendingKeySet()));
         * 
         */

    }

}
