package JAVAMAP;

import java.util.HashMap;


 public class map1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.forEach((String key, String value) -> {
            System.out.println(key + ":" + value);
        });

        
       
        
    }
} 