import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
 class SortedMap10 {
    int a;
    int b; 
    public SortedMap10(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString() {
        return "a:" + a + " b:" + b;
    }
    
        
    

    public static void main(String[] args) throws Exception {
        SortedMap<SortedMap10, Integer> map = new TreeMap<>(Comparator.comparingInt(o -> o.a+ o.b));
        map.put(new SortedMap10(1, 2), 1);
        map.put(new SortedMap10(2, 3), 2);
        map.put(new SortedMap10(3, 4), 3);
        map.put(new SortedMap10(4, 5), 4);
        map.put(new SortedMap10(5, 6), 5);
        map.put(new SortedMap10(6, 7), 6);
        System.out.println("Map:" + map);

        SortedMap<SortedMap10, Integer> map1 = new TreeMap<>(Comparator.comparingInt(o -> (o.a + o.b)*(-1)));

        map1.put(new SortedMap10(1, 2), 1);
        map1.put(new SortedMap10(2, 3), 2);
        map1.put(new SortedMap10(3, 4), 3);
        map1.put(new SortedMap10(4, 5), 4);
        map1.put(new SortedMap10(5, 6), 5);
        map1.put(new SortedMap10(6, 7), 6);
        System.out.println("Map1:" + map1);

        
    }
}
    

