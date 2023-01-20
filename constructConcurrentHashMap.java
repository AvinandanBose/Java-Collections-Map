import java.util.concurrent.ConcurrentHashMap;

public class constructConcurrentHashMap {


    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
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
        System.out.println(" ");

        

     
    }
    
}
