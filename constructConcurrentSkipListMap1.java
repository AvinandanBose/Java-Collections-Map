
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.Comparator;
public class constructConcurrentSkipListMap1 {
    public static void main(String[] args) {
        // ConcurrentSkipListMap​(Comparator<? super K> comparator)
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>((a, b) -> b.compareTo(a));
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        map.put("i", "j");


        System.out.println("Map:" + map);

        Comparator<? super String> comparator = map.comparator();

        System.out.println("Comparator:" + comparator);
        System.out.println("Comparator.compare(\"a\", \"b\"):" + comparator.compare("a", "b"));

        ConcurrentSkipListMap<String, String> map1 = new ConcurrentSkipListMap<>(comparator.reversed());
        map1.put("a", "b");
        map1.put("c", "d");
        map1.put("e", "f");
        map1.put("g", "h");
        System.out.println("Map1:" + map1);
        ConcurrentSkipListMap<String, String> map2 = new ConcurrentSkipListMap<>(comparator);
        map2.put("a", "b");
        map2.put("c", "d");
        map2.put("e", "f");
        map2.put("g", "h");
        System.out.println("Map2:" + map2);

    }
    
}


