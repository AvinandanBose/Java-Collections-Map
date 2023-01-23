import java.util.concurrent.ConcurrentSkipListMap;

public class constructConcurrentSkipListMap{
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        map.put("9", "nine");
        map.put("10", "ten");
        System.out.println("Map:" + map);
    }
}