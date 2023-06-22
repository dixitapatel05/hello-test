package Exam;

import static java.lang.Integer.sum;

public class BasicTest {

//    public static int sum(int a, int b)
//    {
//        return a + b;
//    }
//    public static int sub(int a, int b)
//    {
//        return a - b;
//    }
//    public static int multiple(int a, int b)
//    {
//        return a * b;
//    }
//    public static int div(int a, int b)
//    {
//        return a / b;
//    }

    public static void main(String[] args) {
//        System.out.println(sum(11,22));
//        System.out.println(sub(25,5));
//        System.out.println(multiple(20,10));
//        System.out.println(div(25,5));
//
//        int i;
//        for (i=1; i<11; i++) {
//            System.out.println(i);
//        }

//        int [] marks = {10,20,30,40,50};
//        int i;
//        for (i = 0; i<marks.length; i++){
//            System.out.println(marks[i]);

        //print patten program
        int i;
        int j;
        int row =5;
        for (i=0; i<row; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
