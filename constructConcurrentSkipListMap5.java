import java.util.concurrent.ConcurrentSkipListMap;
import java.util.Comparator;
public class constructConcurrentSkipListMap5 {
    public static Comparator<Integer> valueComparator = new Comparator<>() {
        @Override
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    };

    public static void main(String[] args) {
        // ConcurrentSkipListMap​(Comparator<? super K> comparator)
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>(valueComparator);
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        System.out.println("Map:" + map);

        ConcurrentSkipListMap<Integer, String> map1 = new ConcurrentSkipListMap<>(valueComparator.reversed());

        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(4, "four");
        map1.put(5, "five");
        
        System.out.println("Map1:" + map1);
    }
    
}
