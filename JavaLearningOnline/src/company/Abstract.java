package company;

abstract class Parent{
    public Parent(){
        System.out.println("Constructor of the parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}

class Child3 extends Child2{

    @Override
    public void greet() {

    }

    @Override
    public void greet2() {

    }
}

public class Abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
        Child3 c2 = new Child3();
        c2.th();
    }
}
