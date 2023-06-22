package Exam;

class Student{
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Student(){
//        firstname = "Dixita";
//        lastname = "Patel";
//        age = 27;
//        gender = "Female";
//    }

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

public class Pojo_class {
    public static void printValue(Student[] stdArray){
        for (int i= 0; i<stdArray.length; i++){
//            Student std = stdArray[i];
//            System.out.println(std.getId());
              System.out.println(stdArray[i].getId());
              System.out.println(stdArray[i].getFirstname());
              System.out.println(stdArray[i].getLastname());
              System.out.println(stdArray[i].getAge());
              System.out.println(stdArray[i].getGender());
        }

    }
    public static void main(String[] args) {
        Student s = new Student();

        s.setId(01);
//        System.out.println("Id: " +s.getId());

        s.setFirstname("Dixita");
//        System.out.println("FirstName: " + s.getFirstname());

        s.setLastname("Patel");
//        System.out.println("LastName: " + s.getLastname());

        s.setAge(27);
//        System.out.println("Age: " + s.getAge());

        s.setGender("Female");
//        System.out.println("Gender: " +s.getGender());

        System.out.println();

        Student s2 = new Student();
        s2.setId(02);
//        System.out.println("Id: " +s2.getId());

        s2.setFirstname("Dhruv");
//        System.out.println("FirstName: " + s2.getFirstname());

        s2.setLastname("Patel");
//        System.out.println("LastName: " + s2.getLastname());

        s2.setAge(30);
//        System.out.println("Age: " + s2.getAge());

        s2.setGender("Male");
//        System.out.println("Gender: " +s2.getGender());

        Student[] std = {s, s2};

        printValue(std);


    }
}
