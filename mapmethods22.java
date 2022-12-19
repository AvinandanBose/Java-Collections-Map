import java.util.HashMap;
public class mapmethods22 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
   
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
       System.out.println(map.entrySet());

       // entrySet().forEach()
       map.entrySet().forEach((entry) -> {
           System.out.println(entry.getKey() + " " + entry.getValue());
       });

       // entrySet().size()
       System.out.println(map.entrySet().size());

       // entrySet().toArray()
       Object[] arr = map.entrySet().toArray();
       for (Object obj : arr) {
           System.out.println(obj);
       }

       // entrySet().removeIf()
       map.entrySet().removeIf((entry) -> entry.getKey().equals("a"));
       System.out.println("After removeIf:" + map);

       // entrySet().remove()
       map.entrySet().remove(map.entrySet().iterator().next());
       System.out.println("After remove:" + map);

       // entrySet().retainAll()
       map.entrySet().retainAll(map.entrySet());
       System.out.println("After retainAll:" + map);

       // entrySet().removeAll()
       map.entrySet().removeAll(map.entrySet());

       System.out.println("After removeAll:" + map);


    }
    
}
