import java.util.TreeMap;
import java.util.Comparator;

 public class TreeMapMethods2 {
    
    public static Comparator<Integer> valueComparator = new Comparator<>() {
        @Override
        public int compare(Integer k1, Integer k2) {
            int compare = (k1).compareTo(k2);
            if (k1 == k2) {
                return 0;
            }

            else {
                return compare;

                
            }

        }

    };

    int age;
    TreeMapMethods2(int age) {
        this.age = age;
    }
       
       public Integer getAge() {
           return this.age;
       }
       @Override
       public String toString() {
           return "age : " + age;
       }

    }
    

class CompareToTreeMethods2 implements Comparator<TreeMapMethods2>{
  
    @Override
    public int compare(TreeMapMethods2 o1, TreeMapMethods2 o2) {
        return o2.getAge().compareTo(o1.getAge());
    }

   
}

class execution{
    public static void main(String[]args ){

        //Comparator
        TreeMap<TreeMapMethods2, String> treeMap = new TreeMap<>(new CompareToTreeMethods2());
        treeMap.put(new TreeMapMethods2(1), "A");
        treeMap.put(new TreeMapMethods2(2), "B");
        treeMap.put(new TreeMapMethods2(3), "C");
        treeMap.put(new TreeMapMethods2(4), "D");
        treeMap.put(new TreeMapMethods2(5), "E");
        treeMap.put(new TreeMapMethods2(6), "F");
        treeMap.put(new TreeMapMethods2(7), "G");
        treeMap.put(new TreeMapMethods2(8), "H");
        treeMap.put(new TreeMapMethods2(9), "I");
        treeMap.put(new TreeMapMethods2(10), "J");
        treeMap.put(new TreeMapMethods2(11), "K");
        treeMap.put(new TreeMapMethods2(12), "L");
        treeMap.put(new TreeMapMethods2(13), "M");
        treeMap.put(new TreeMapMethods2(14), "N");
        treeMap.put(new TreeMapMethods2(15), "O");
        treeMap.put(new TreeMapMethods2(16), "P");
        treeMap.put(new TreeMapMethods2(17), "Q");
        treeMap.put(new TreeMapMethods2(18), "R");
        treeMap.put(new TreeMapMethods2(19), "S");
        treeMap.put(new TreeMapMethods2(20), "T");
        treeMap.put(new TreeMapMethods2(21), "U");
        treeMap.put(new TreeMapMethods2(22), "V");
        treeMap.put(new TreeMapMethods2(23), "W");
        treeMap.put(new TreeMapMethods2(24), "X");
        treeMap.put(new TreeMapMethods2(25), "Y");
        treeMap.put(new TreeMapMethods2(26), "Z");
        System.out.println(treeMap);
        System.out.println(" ");
    
        
        TreeMap<Integer, Integer> treeMap1TreeMap = new TreeMap<>(TreeMapMethods2.valueComparator);

        treeMap1TreeMap.put(1, 1);
        treeMap1TreeMap.put(2, 2);
        treeMap1TreeMap.put(3, 3);
        treeMap1TreeMap.put(4, 4);
        
    
        int res = TreeMapMethods2.valueComparator.compare(treeMap1TreeMap.get(1), treeMap1TreeMap.get(2));
        
        System.out.println(res);

        int res1 = TreeMapMethods2.valueComparator.compare(treeMap1TreeMap.get(3), treeMap1TreeMap.get(1));

        System.out.println(res1);

        int res3 = TreeMapMethods2.valueComparator.compare(treeMap1TreeMap.get(4), treeMap1TreeMap.get(4));

        System.out.println(res3);


        //FirstKey

        System.out.println(treeMap.firstKey());
        System.out.println(" ");

        //LastKey

        System.out.println(treeMap.lastKey());
        System.out.println(" ");

        //HeadMap(toKey:Key)
        System.out.println(treeMap.headMap(new TreeMapMethods2(0)));
        System.out.println(" ");
        System.out.println(treeMap.headMap(new TreeMapMethods2(1)));
        System.out.println(" ");
        System.out.println(treeMap.headMap(new TreeMapMethods2(2)));
        System.out.println(" ");
        System.out.println(treeMap.headMap(new TreeMapMethods2(3)));
        System.out.println(" ");
        System.out.println(treeMap.headMap(new TreeMapMethods2(4)));
        System.out.println(" ");
        System.out.println(treeMap.headMap(new TreeMapMethods2(5)));
        System.out.println(" ");
        System.out.println(treeMap.headMap(new TreeMapMethods2(6)));

        System.out.println(" ");
        System.out.println(treeMap1TreeMap.headMap(5));
        System.out.println(treeMap1TreeMap.headMap(4));
        System.out.println(treeMap1TreeMap.headMap(3));
        System.out.println(treeMap1TreeMap.headMap(2));
        System.out.println(" ");

      

        // TailMap(fromKey:Key)

        System.out.println(treeMap.tailMap(new TreeMapMethods2(25)));
        System.out.println(" ");
        System.out.println(treeMap.tailMap(new TreeMapMethods2(24)));
        System.out.println(" ");
        System.out.println(treeMap.tailMap(new TreeMapMethods2(21)));

        System.out.println(" ");

        System.out.println(treeMap1TreeMap.tailMap(1));
        System.out.println(treeMap1TreeMap.tailMap(2));
        System.out.println(treeMap1TreeMap.tailMap(3));
        System.out.println(treeMap1TreeMap.tailMap(4));

        //SubMap(fromKey:Key, toKey:Key)
        System.out.println(treeMap.subMap(new TreeMapMethods2(26), new TreeMapMethods2(21)));

        System.out.println(treeMap.subMap(new TreeMapMethods2(22), new TreeMapMethods2(20)));

        System.out.println(treeMap1TreeMap.subMap(1, 4));
        


    }
}


