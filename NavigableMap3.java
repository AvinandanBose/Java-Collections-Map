import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMap3 {

    // descendingKeySet
    public static void main(String[] args) throws Exception {
        NavigableMap<Float, Integer> map = new TreeMap<>();
        map.put(1.8f,11 );
        map.put(2.6f, 9);
        map.put(3.4f, 78);
        map.put(4.3f, 5);
        map.put(5.6f, 1);
        map.put(6.8f, 3);
        System.out.println("Map:" + map);
        System.out.println("Descending Key Set:" + map.descendingKeySet());
        //pollFirst() and pollLast() are used to remove the first and last element from the set
        System.out.println("Descending Key Set:" + map.descendingKeySet().pollFirst());
        System.out.println("Descending Key Set:" + map.descendingKeySet().pollLast());
        System.out.println("Descending Key Set:" + map.descendingKeySet());

        //It is possible to remove the first and last element from the set using the remove() method
          map.descendingKeySet().remove(2.6f);
        System.out.println("Descending Key Set:" + map.descendingKeySet());

        //retainAll() method is used to retain the elements from the set
        map.descendingKeySet().retainAll(map.descendingKeySet());
        System.out.println("Descending Key Set:" + map.descendingKeySet());

        //removeAll() method is used to remove all the elements from the set
         map.descendingKeySet().removeAll(map.descendingKeySet());
        System.out.println("Descending Key Set:" + map.descendingKeySet());


      
        //Hence all such set operations are supported by the descendingKeySet() method
        //Except it doesnot Support add() method and addAll() method
        /*
        Not Supported
        ---------------
        System.out.println("Descending Key Set:" + map.descendingKeySet().add(1.8f));
        System.out.println("Descending Key Set:" + map.descendingKeySet().addAll(map.descendingKeySet()));
 
    */
    }
}
