package company;
import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(20);
        l2.add(11);
        l2.add(95);

        l1.add(6);
        l1.add(9);
        l1.add(0,1);
        l1.addAll(l2);
//      l1.clear();

        System.out.println(l1.contains(6));
        System.out.println(l1.indexOf(9));

        l1.set(2, 92);
        System.out.println("Before : " + l1);

        // Remove the element at index `5`
//        l1.remove(1);


        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(l1);
        System.out.println("After : " + l1);

        for (int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print("");
        }
    }
}
