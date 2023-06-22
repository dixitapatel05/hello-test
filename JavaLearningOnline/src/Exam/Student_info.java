package Exam;
import java.util.HashMap;

public class Student_info {
    public static void main(String[] args) {

        HashMap<String, Integer> studetails = new HashMap<>();
        studetails.put("Dixita", 99595);
        studetails.put("Dhruv", 94899);
        studetails.put("Dharm", 43555);
        studetails.put("Krina", 43434);
        studetails.put("Ekta", 51195);
        int value = 344434;
        studetails.put("Dixita", value);
        System.out.println(studetails);

        for (String s: studetails.keySet()
             ) {
            System.out.println("Name: " + s + " PhoneNumber: " +studetails.get(s));
        }




    }
}
