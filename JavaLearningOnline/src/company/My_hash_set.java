package company;

import java.util.HashSet;
import java.util.*;

public class My_hash_set {
    public static void main(String[] args) {
        HashSet<Integer> myhashset = new HashSet<>(6,8.6f);
        HashMap<Integer, String> hm1 = new HashMap<>();

        myhashset.add(20);
        myhashset.add(11);
        myhashset.add(05);
        myhashset.add(22);
        myhashset.add(20);
        System.out.println(myhashset);

        // Adding elements using put method
        // Custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        System.out.println("Mappings of HashMap hm1 are : "
                + hm1);
    }
}
