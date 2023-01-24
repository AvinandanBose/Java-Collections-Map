import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class MapEntry_LinkedHashMap {
    public static void main(String[] args) throws Exception {
        // headMap
        Map<String, String> map = new LinkedHashMap<>();
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

        //#1
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }

        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }
        // #2
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("Entry Set:" + entries); 

        Set<Entry<String, String>> entries1 = map.entrySet();
        System.out.println("Entry Set:" + entries1);
        
        LinkedHashMap<String, String> map2 = new LinkedHashMap<>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > 3;
            }
        };
        map2.put("1", "one");
        map2.put("2", "two");
        map2.put("3", "three");
        map2.put("4", "four");
        map2.put("5", "five");
        map2.put("6", "six");

        System.out.println("Map2:" + map2);

        LinkedHashMap<String, String> map3 = new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Entry<String, String> eldest) {
                return size() > 3;
            }
        };
        map3.put("1", "one");
        map3.put("2", "two");
        map3.put("3", "three");
        map3.put("4", "four");
        map3.put("5", "five");
        map3.put("6", "six");

        System.out.println("Map3:" + map3);
        }



      
    }



       

  
    

