package company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    @Override
    public String[] getNetwork() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Dhruv", "Dixita", "Chirag5G"};
        return networkList;
    }
// Override the method
//    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class Interface_default_method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();

        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetwork();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
