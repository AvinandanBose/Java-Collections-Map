
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
public class SortedMap2 {
    //Comparator to sort TreeMap by values
    public static Comparator<Object> valueComparator = new Comparator<>() {
        @Override
        public int compare(Object k1, Object k2) {
          
            if (k1.hashCode() == k2.hashCode())
            {
                return 0;
            }
               
            else if (k1.hashCode() > k2.hashCode())
            {
                return 1;
            }
            else
            {
                return -1;
            }
           
                
        }
        public String toString() {
            return "Value Compared";
        }
        
    };
    public static void main(String[] args) {
        //Create a TreeMap using valueComparator
        SortedMap<String,Integer> sortedMap= new TreeMap<>(valueComparator);
   
        // Add key-value pairs to TreeMap
        sortedMap.put("a", 10);
        sortedMap.put("c", 30);
        sortedMap.put("b", 20);
        sortedMap.put("d", 40);
        sortedMap.put("e", 50);
        sortedMap.put("f", 60);
        sortedMap.put("g", 70);
        sortedMap.put("h", 80);


        //Print the TreeMap
        System.out.println(sortedMap);

        //Compare 

        System.out.println(valueComparator.compare(1, 3));
        System.out.println(valueComparator.compare(3, 1));
        System.out.println(valueComparator.compare(1, 1));
        System.out.println(valueComparator.compare(sortedMap.get("a"), sortedMap.get("a")));
        System.out.println(valueComparator.compare(sortedMap.get("a"), sortedMap.get("b")));
        System.out.println(valueComparator.compare(sortedMap.get("b"), sortedMap.get("a")));

        Comparator comp = sortedMap.comparator();
        System.out.println(comp);
       
    }
    
}
