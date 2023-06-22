package Exam;

import java.util.ArrayList;
import java.util.List;

class Students{
    private int rollno;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;

    Students(int rollno,String firstname, String lastname,int age,String gender){
        this.rollno=rollno;
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.gender=gender;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


public class Stu_arraylist {
    public static void main(String[] args) {

        Students s1 = new Students(1,"Dixi", "Patel", 26, "Female");
        Students s2 = new Students(2,"Dhruv", "Patel", 30, "Male");

        ArrayList<Students> al = new ArrayList<Students>();
        al.add(s1);
        al.add(s2);

        for(int i= 0; i<al.size(); i++){
            System.out.println("Roll Number : " + al.get(i).getRollno());
            System.out.println("First Name: " +al.get(i).getFirstname());
            System.out.println("Last Name: " +al.get(i).getLastname());
            System.out.println("Age: " +al.get(i).getAge());
            System.out.println("Gender: " +al.get(i).getGender());
        }

    }
}
