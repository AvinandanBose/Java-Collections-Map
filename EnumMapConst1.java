import java.util.EnumMap;

public class EnumMapConst1 {

    enum Weather{
        Cold,
        Sunny,
        Rainy
    }
    public static void main(String[] args) throws Exception {
        //EnumMap(Class keyType)
       
        EnumMap<Weather, String> map = new EnumMap<>(Weather.class);
    
            map.put(Weather.Sunny, "Sunny");
            map.put(Weather.Cold, "Cold");
            map.put(Weather.Rainy, "Rainy");
            System.out.println("Map:" + map);
       
            
        }
       
}
    

