import java.util.EnumMap;

public class EnumMapConst2 {
    enum Weather {
        Cold,
        Sunny,
        Rainy
    }

    public static void main(String[] args) throws Exception {
        // EnumMap(EnumMap m)

        EnumMap<Weather, String> map = new EnumMap<>(Weather.class);
        map.put(Weather.Sunny, "Sunny");
        map.put(Weather.Cold, "Cold");
        map.put(Weather.Rainy, "Rainy");
        EnumMap<Weather, String> map1 = new EnumMap<>(map);
       
        System.out.println("Map:" + map1);

    }
}
