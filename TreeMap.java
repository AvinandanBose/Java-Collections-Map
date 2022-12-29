import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMap1 {
    public static void main(String[] args) throws Exception {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
       
        tree_map.put(1, "one");
        tree_map.put(2, "two");
        tree_map.put(3, "three");
        tree_map.put(4, "four");
        tree_map.put(5, "five");
        tree_map.put(6, "six");
        tree_map.put(7, "seven");
        tree_map.put(8, "eight");
        tree_map.put(9, "nine");
        tree_map.put(10, "ten");
        System.out.println("TreeMap: " + tree_map);
        System.out.println(" ");
        Set<Map.Entry<Integer, String>> s = tree_map.entrySet();
        System.out.println("Set: " + s);
        System.out.println(" ");
        
        for (Map.Entry<Integer, String> e:s) {
            System.out.println(e.getKey() + " " + e.getValue());
            
            e.setValue("My Value");

            System.out.println(e.getKey() + "   " + e.getValue());
        }
        System.out.println("Set: " + s);

        // Unsopported Operation Exception
        Map.Entry<Integer, String> f = tree_map.firstEntry();
        System.out.println("First Entry: " + f);
        Map.Entry<Integer, String> f1 = tree_map.lastEntry();
        System.out.println("Last Entry: " + f1);
        System.out.println(" " );
        f.setValue("My Value");
        System.out.println("After Change First Entry: " + f);
     
        f.setValue("My Value");
        System.out.println("After Change Last Entry: " + f1);
        
    }


    
}
