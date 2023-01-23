 import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
 class SortedMap11 {
     int a;
     int b;

     public SortedMap11(int a, int b) {
        this.a = a;
        this.b = b;
    }

     public String toString() {
         return "a:" + a + " b:" + b;
     }

    
}

class srtMp implements Comparator<SortedMap11> {

    @Override
    public int compare(SortedMap11 o1, SortedMap11 o2) {
        return o1.a - o2.b;
    }
    
}

class Main{
    public static void main(String[] args) throws Exception {
        SortedMap<SortedMap11, Integer> map = new TreeMap<>(new srtMp());
        map.put(new SortedMap11(1, 2), 1);
        map.put(new SortedMap11(2, 3), 2);
        map.put(new SortedMap11(3, 4), 3);
        map.put(new SortedMap11(4, 5), 4);
        map.put(new SortedMap11(5, 6), 5);
        map.put(new SortedMap11(6, 7), 6);
        System.out.println("Map:" + map);
        
    }
}
