import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {
    //Comparator to sort TreeMap by values
    public static Comparator<Integer> valueComparator = new Comparator<>() {
        @Override
        public int compare(Integer k1, Integer k2) {
            int compare =  (k1).compareTo(k2);
            if (k1 == k2)
            {
                return 0;
            }
               
            else
            {
                return compare;
            }
           
                
        }
        
    };
    public static void main(String[] args) {
        //Create a TreeMap using valueComparator
        SortedMap<Integer,Integer> sortedMap= new TreeMap<>(valueComparator);
   
        //Add key-value pairs to TreeMap
        sortedMap.put(1, 10);
        sortedMap.put(3, 30);
        sortedMap.put(2, 20);
        sortedMap.put(4, 40);

        //Print the TreeMap
        System.out.println(sortedMap);

        //Compare 

        System.out.println(valueComparator.compare(1, 3));
        System.out.println(valueComparator.compare(3, 1));
        System.out.println(valueComparator.compare(1, 1));
        System.out.println(valueComparator.compare(sortedMap.get(1), sortedMap.get(1)));
        System.out.println(valueComparator.compare(sortedMap.get(2), sortedMap.get(1)));
        System.out.println(valueComparator.compare(sortedMap.get(1), sortedMap.get(2)));

        Comparator comp = sortedMap.comparator();
        System.out.println(comp);
       
        
       
          
        
        

    }


}

