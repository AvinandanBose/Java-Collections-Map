import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapConst3 {
    enum Weather {
        Cold,
        Sunny,
        Rainy
    }

    public static void main(String[] args) throws Exception {
        // EnumMap(Map m)
        Map<Weather, String> map = new HashMap<>();
        map.put(Weather.Sunny, "Sunny");
        map.put(Weather.Cold, "Cold");
        map.put(Weather.Rainy, "Rainy");

        EnumMap<Weather, String> map1 = new EnumMap<>(map);

        System.out.println("Map:" + map1);

    }

}
