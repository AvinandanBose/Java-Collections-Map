import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map.Entry;

 class TreeMap3 {
    int no;
    String name;
    int value;

    TreeMap3(int no, String name, int value) {
        this.no = no;
        this.name = name;
        this.value = value;
        System.out.println("TreeMap2: " + no + " " + name + " " + value);
    }

    @Override
    public String toString() {
        return this.no + " " + this.name + " "
                + this.value;
    }
}

class CompareToTreeMap3 implements Comparator<TreeMap3> {

    @Override
    public int compare(TreeMap3 o1, TreeMap3 o2) {
        System.out.println(" " );
        System.out.println("o1.value:" + o1.value);
        System.out.println("o2.value:" + o2.value);
        System.out.println("o2.value-o1.value:" + (o2.value - o1.value));
        System.out.println(" ");
        return o2.value - o1.value;
    }

}

class newTreeMap3 {

    public static void main(String[] args) {
        TreeMap<TreeMap3, String> tree_map = new TreeMap<>(new CompareToTreeMap3());
        tree_map.put(new TreeMap3(1, "one", 1), "one");
        tree_map.put(new TreeMap3(2, "two", 2), "two");
        tree_map.put(new TreeMap3(3, "three", 3), "three");
        tree_map.put(new TreeMap3(4, "four", 4), "four");
        tree_map.put(new TreeMap3(5, "five", 5), "five");
        tree_map.put(new TreeMap3(6, "six", 6), "six");
        System.out.println("TreeMap: " + tree_map);

        for (Entry<TreeMap3, String> entry : tree_map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
