import java.util.HashMap;
import java.util.WeakHashMap;
public class weakhashmap2 {
    public static void main(String[] args) throws Exception {
        WeakHashMap<Object, Integer> map = new WeakHashMap<>();
        demo d = new demo();
        map.put(d, 1);
        System.out.println("Map:" + map);
        d = null;
        System.gc();
        Thread.sleep(4000);
        System.out.println("Map:" + map);

        //if not gc is called then output is Map:{demo=1}
        //after gc is called then output is Map:{} and Finalize method called
        //indicates Weak Reference is cleared by gc

        map.put(d, 1); // d= null
        System.out.println("Map:" + map);
        demo d2 = new demo();
        map.put(d2, 2);
        Thread.sleep(4000);
        System.out.println("Map:" + map);

        //vs HashMap
        HashMap<Object, Integer> m = new HashMap<>();
        demo d1 = new demo();
        m.put(d1, 1);
        System.out.println("Map:" + m);
        d1 = null;
        System.gc();
        Thread.sleep(4000);
        System.out.println("Map:" + m);
        

    }

}
class demo{
    @Override
    public String toString() {
        return "demo";
    }
    public void finalize(){
        System.out.println("Finalize method called");
    }

}