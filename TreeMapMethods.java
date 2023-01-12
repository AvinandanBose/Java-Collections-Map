import java.util.Iterator;
import java.util.TreeMap;

class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();

        // Put
        tree_map.put(1, "one");
        tree_map.put(2, "two");
        tree_map.put(3, "three");
        tree_map.put(4, "four");
        System.out.println("TreeMap: " + tree_map);

        // Clone
        TreeMap<Integer, String> tree_map_clone = new TreeMap<>();
        tree_map_clone = (TreeMap<Integer, String>) tree_map.clone();
        System.out.println("TreeMap Clone: " + tree_map_clone);

        // ContainsKey
        Boolean b = tree_map.containsKey(1);
        System.out.println("TreeMap ContainsKey: " + b);

        // ContainsValue
        Boolean c = tree_map.containsValue("one");
        System.out.println("TreeMap ContainsValue: " + c);

        // forEach
        tree_map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

        // get
        String g = tree_map.get(1);
        System.out.println("TreeMap Get: " + g);
        String g2 = tree_map.get(4);
        System.out.println("TreeMap Get: " + g2);

        // getOrDefault
        String gd = tree_map.getOrDefault(1, "one");
        System.out.println("TreeMap GetOrDefault: " + gd);
        String gd2 = tree_map.getOrDefault(4, "four");
        System.out.println("TreeMap GetOrDefault: " + gd2);

        // isEmpty
        Boolean isEmpty = tree_map.isEmpty();
        System.out.println("TreeMap isEmpty: " + isEmpty);

        // keySet
        // ++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("TreeMap keySet: " + tree_map.keySet());

        // keySet().forEach()
        tree_map.keySet().forEach((k) -> System.out.println("Key: " + k));

        // keySet().size()
        System.out.println("Size: " + tree_map.keySet().size());

        // keySet().toArray()
        Object[] keySet = tree_map.keySet().toArray();
        for (Object obj : keySet) {
            System.out.println(obj);
        }

        // keySet().toArray(T[] a)
        Integer[] keySet2 = tree_map.keySet().toArray(new Integer[tree_map.keySet().size()]);
        for (Integer i : keySet2) {
            System.out.println(i);
        }

        // keySet().removeIf()
        tree_map.keySet().removeIf((k) -> k == 1);
        System.out.println("TreeMap keySet removeIf: " + tree_map.keySet());

        // keySet().remove()
        tree_map.keySet().remove(2);
        System.out.println("TreeMap keySet remove: " + tree_map.keySet());

        // keySet().retainAll()
        tree_map.keySet().retainAll(tree_map_clone.keySet());
        System.out.println("TreeMap keySet retainAll: " + tree_map.keySet());

        // keySet().removeAll()
        tree_map.keySet().removeAll(tree_map_clone.keySet());
        System.out.println("TreeMap keySet removeAll: " + tree_map.keySet());

        tree_map.putAll(tree_map_clone);
        System.out.println("TreeMap putAll: " + tree_map);

        // keySet().clear()
        tree_map.keySet().clear();
        System.out.println("TreeMap keySet clear: " + tree_map.keySet());

        tree_map.putAll(tree_map_clone);
        System.out.println("TreeMap putAll: " + tree_map);

        // keySet().contains()
        Boolean keySetContains = tree_map.keySet().contains(1);
        System.out.println("TreeMap keySet contains: " + keySetContains);

        // keySet().containsAll()
        Boolean keySetContainsAll = tree_map.keySet().containsAll(tree_map_clone.keySet());
        System.out.println("TreeMap keySet containsAll: " + keySetContainsAll);

        // keySet().equals()
        Boolean keySetEquals = tree_map.keySet().equals(tree_map_clone.keySet());
        System.out.println("TreeMap keySet equals: " + keySetEquals);

        // .....etc. of all Set operations except add() and addAll()
        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // putAll
        tree_map.putAll(tree_map_clone);
        System.out.println("TreeMap putAll: " + tree_map);

        // remove(key:Key)
        tree_map.remove(1);
        System.out.println("TreeMap remove: " + tree_map);

        // remove(key:Key, value:Value)
        tree_map.remove(2, "two");
        System.out.println("TreeMap remove: " + tree_map);

        // replace(key:Key, oldValue: Value , newValue: NewValue)
        tree_map.replace(3, "three", "Three");
        System.out.println("TreeMap replace: " + tree_map);

        tree_map.putAll(tree_map_clone);

        // replaceAll

        tree_map.replaceAll((k, v) -> v + "Value");
        System.out.println("TreeMap replaceAll: " + tree_map);

        // size

        System.out.println("Size of the map:" + tree_map.size());

        // Values
        // ++++++++++++++++++++++++++++++++++++++++++++++++++//
        tree_map.values().forEach(System.out::println);
        System.out.println(" ");
        tree_map.values().forEach((v) -> System.out.println(v));
        System.out.println(" ");
        System.out.println("Values :" + tree_map.values());
        // remove
        tree_map.values().remove(2);
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println("Map:" + tree_map.values());
        System.out.println(" ");
        // removeAll
        tree_map.values().removeAll(tree_map.values());
        System.out.println(tree_map.values());
        System.out.println(" ");

        tree_map.putAll(tree_map_clone);

        // removeIf
        tree_map.values().removeIf((v) -> v == "two");
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println(" ");
        // retainAll
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(4, "four");
        System.out.println("Map1: " + map1);
        System.out.println("Map1: " + map1.values());
        tree_map.values().retainAll(map1.values());
        System.out.println(" ");
        System.out.println("Map:" + map1);
        System.out.println(" ");

        System.out.println(tree_map.values());

        // Clear
        tree_map.values().clear();

        System.out.println("Map:" + tree_map);

        // Iterator
        tree_map.put(1, "One");
        tree_map.put(2, "Two");
        tree_map.put(3, "Three");
        tree_map.put(4, "Four");
        tree_map.put(5, "Five");
        tree_map.put(6, "Six");
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println(" ");

        // Iterator in map.values()→TreeMap
        Iterator<String> itr = tree_map.values().iterator();
        try {

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }

        System.out.println(" ");
        // Iterator remove
        itr = tree_map.values().iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println(" ");

        // ++++++++++++++++++++++++++++++++++++++++++++++++//

        tree_map.putAll(tree_map_clone);
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println(" ");

        // putIfAbsent
        tree_map.putIfAbsent(5, "five");
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println(" ");

        // Compute
        tree_map.compute(1, (k, v) -> v + "Value");
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println(" ");

        // computeIfAbsent

        tree_map.computeIfAbsent(7, (k) -> "seven");
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println(" ");

        // computeIfPresent
        tree_map.computeIfPresent(2, (k, v) -> v + "Value");
        System.out.println(" ");
        System.out.println("Map:" + tree_map);
        System.out.println(" ");

        // merge
        tree_map.merge(6, "f", (v1, v2) -> v1 + v2);
        System.out.println(tree_map);
        tree_map.merge(7, "g", (v1, v2) -> v2);
        System.out.println(tree_map);

        tree_map.forEach((key, value) -> tree_map.merge(key, value, (v1, v2) -> v1 + v2));
        System.out.println(tree_map);

        tree_map.merge(7, "gg", (v1, v2) -> null); // removes the entry
        System.out.println(tree_map);

        // replace(key:Key, value:Value)
        tree_map.replace(1, "one");
        System.out.println(tree_map);

        // replace(key:Key, oldValue: Value , newValue: NewValue)[Re-created]
        tree_map.replace(1, "one", "oneValue");
        System.out.println(tree_map);

        // EntrySet
        // ++++++++++++++++++++++++++++++++++++++++++++++++++//
        System.out.println(tree_map.entrySet());

        // entrySet().forEach()
        tree_map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        // entrySet().size()
        System.out.println(tree_map.entrySet().size());

        // entrySet().toArray()
        Object[] arr = tree_map.entrySet().toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // entrySet().removeIf()
        tree_map.entrySet().removeIf((entry) -> entry.getKey().equals(1));
        System.out.println("After removeIf:" + tree_map);

        // entrySet().remove()
        tree_map.entrySet().remove(tree_map.entrySet().iterator().next());
        System.out.println("After remove:" + tree_map);

        // entrySet().retainAll()
        tree_map.entrySet().retainAll(tree_map_clone.entrySet());
        System.out.println("After retainAll:" + tree_map);

        // entrySet().removeAll()
        tree_map.entrySet().removeAll(tree_map_clone.entrySet());
        System.out.println("After removeAll:" + tree_map);

        // ++++++++++++++++++++++++++++++++++++++++++++++++++//
        tree_map.putAll(tree_map_clone);

        // equals
        Boolean d = tree_map.equals(tree_map_clone);
        System.out.println("Equals / Not:" + b);
        System.out.println(" ");
        // hashCode
        int h = tree_map.hashCode();
        System.out.println("HashCode:" + h);
        System.out.println(" ");

        // toString
        String s = tree_map.toString();
        System.out.println("ToString:" + s);
        System.out.println(" ");

    }
}
