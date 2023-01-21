import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethods4 {

    public static void main(String[] args) throws Exception {
        //mappingcount
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");

        System.out.println("Map:" + map);

        int count = (int) map.mappingCount();
        System.out.println("MappingCount:" + count);   
        System.out.println("MappingCount1:" + map.mappingCount());

        // concurrent insertions
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");

        int count2 = (int) map.mappingCount();
        System.out.println("MappingCount2:" + count2);

        // concurrent removals
        map.remove("one");
        map.remove("two");
        map.remove("three");

        int count3 = (int) map.mappingCount();
        System.out.println("MappingCount3:" + count3);
    }

    
}
