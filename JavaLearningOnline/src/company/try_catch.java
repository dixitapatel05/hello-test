package company;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
         int[] marks = new int[3];
         marks[0]=7;
         marks[1]=25;
         marks[2]=75;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " +marks[ind]);
            System.out.println("The value of array-value/number is: " +marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }


//        int a = 1000;
//        int b = 0;
//        try{
//            int c = a/b;
//            System.out.println("The result is " +c);
//        }
//        catch (Exception e){
//            System.out.println("We failed to divide");
//            System.out.println(e);
//        }
//        System.out.println("End of the Program");
    }
}
