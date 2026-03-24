import java.util.*;

class HashtableCRUD {
    public static void main(String args[]) {

        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("India", 1);
        ht.put("Usa", 1);
        ht.put("Russia", 1);

        System.out.println("After Adding: " + ht);

        System.out.println("Read Elements from Hashtable:");
        for (String key : ht.keySet()) {
            System.out.println(key);
        }

        ht.remove("Russia");
        ht.put("UK", 1);

        System.out.println("Updated Hashtable: " + ht);

        ht.remove("Usa");   // Case-sensitive
        System.out.println("After Deletion: " + ht);
    }
}