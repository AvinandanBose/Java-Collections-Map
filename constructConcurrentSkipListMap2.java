import java.util.concurrent.ConcurrentSkipListMap;
import java.util.Comparator;
public class constructConcurrentSkipListMap2 {
    int no;
    String name;
    int value;
    public constructConcurrentSkipListMap2(int no, String name, int value) {
        this.no = no;
        this.name = name;
        this.value = value;
    }
    public String toString() {
        return "no:" + no + ", name:" + name + ", value:" + value;
    }
    
}

class Temp1 implements Comparator<constructConcurrentSkipListMap2>{
    @Override
    public int compare(constructConcurrentSkipListMap2 o1, constructConcurrentSkipListMap2 o2) {
        return o1.no - o2.no;
    }
}


 class Main {
    public static void main(String[] args) {
        // ConcurrentSkipListMap​(Comparator<? super K> comparator)
        ConcurrentSkipListMap<constructConcurrentSkipListMap2, String> map = new ConcurrentSkipListMap<>(new Temp1());
        map.put(new constructConcurrentSkipListMap2(1, "a", 100), "one");
        map.put(new constructConcurrentSkipListMap2(2, "b", 200), "two");
        map.put(new constructConcurrentSkipListMap2(3, "c", 300), "three");
        map.put(new constructConcurrentSkipListMap2(4, "d", 400), "four");
        map.put(new constructConcurrentSkipListMap2(5, "e", 500), "five");
        map.put(new constructConcurrentSkipListMap2(6, "f", 600), "six");
        map.put(new constructConcurrentSkipListMap2(7, "g", 700), "seven");
        map.put(new constructConcurrentSkipListMap2(8, "h", 800), "eight");
        map.put(new constructConcurrentSkipListMap2(9, "i", 900), "nine");
        map.put(new constructConcurrentSkipListMap2(10, "j", 1000), "ten");
        System.out.println("Map:" + map);
    }
}