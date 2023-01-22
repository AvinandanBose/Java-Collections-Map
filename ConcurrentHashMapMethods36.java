import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapMethods36 {

    //searchValues​(long parallelismThreshold, Function<? super V,​? extends U> searchFunction)

    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        System.out.println("Map:" + map);

        String result = map.searchValues(2, v -> {
            System.out.println("Value:" + v);
            if (v.equals("3")) {
                return v;
            }
            return null;
        });
        System.out.println("Result:" + result);
    }
    
}
