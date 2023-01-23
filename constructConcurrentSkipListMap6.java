import java.util.concurrent.ConcurrentSkipListMap;
import java.util.Comparator;
  class constructConcurrentSkipListMap6 {

    int a;
    int b;

    public constructConcurrentSkipListMap6(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "a:" + a + " b:" + b;
    }

    public static void main(String[] args) throws Exception {
        // ConcurrentSkipListMap​(Comparator<? super K> comparator)
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>(Comparator.reverseOrder());
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        System.out.println("Map:"+map);

        
        ConcurrentSkipListMap<String, String> map2 = new ConcurrentSkipListMap<>(Comparator.naturalOrder());
        map2.put("1", "one");
        map2.put("2", "two");
        map2.put("3", "three");
        map2.put("4", "four");
        map2.put("5", "five");
        System.out.println("Map:"+map2);


        ConcurrentSkipListMap<Integer,Integer> map3 = new ConcurrentSkipListMap<>(Comparator.comparingInt(o -> o*(-1)));

        map3.put(1, 1);
        map3.put(2, 2);
        map3.put(3, 3);
        map3.put(4, 4);
        map3.put(5, 5);
        System.out.println("Map:"+map3);


        ConcurrentSkipListMap<constructConcurrentSkipListMap6, Integer> map4 = new ConcurrentSkipListMap<>(
                Comparator.comparingInt(o -> (o.a+o.b)*(-1)));

        map4.put(new constructConcurrentSkipListMap6(1, 1), 1);
        map4.put(new constructConcurrentSkipListMap6(2, 2), 2);
        map4.put(new constructConcurrentSkipListMap6(3, 3), 3);
        map4.put(new constructConcurrentSkipListMap6(4, 4), 4);
        map4.put(new constructConcurrentSkipListMap6(5, 5), 5);
        System.out.println("Map:"+map4);
      
        
        
    }
    
}
