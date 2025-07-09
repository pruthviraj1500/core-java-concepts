package core_java_concepts;

interface MyCamera {

    void takeSnap();                              //Abstraction
    void recordVideo();

}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{

    private int a = 10;
    private int b = 20;

    public int getA() {                           // Encapsulation
        return a;
    }

    public int getB() {
        return b;
    }

    void callNumber(int phoneNumber) {
        System.out.println("Calling " +phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {

    @Override                                       // Runtime Polymorphism
    public void takeSnap() {
        System.out.println("Taking Sanp....");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video Recording....");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks....");
        return new String[]{"Idea", "Airtel", "Reliance"};
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }

    public void sampleMath() {
        System.out.println("Math");
    }
}

public class ObjectOrientedProgramming {

    public void Calculate(int a, int b) {                          //Compile time Polymorphism
        System.out.println("Addition of two number is : "+ (a+b) );
    }

    public void Calculate(int a, int b, int c) {
        System.out.println("Addition of two number is : "+ (a+b+c) );
    }


    public static void main(String[] args){
        System.out.println("In main method");

        MyCamera cam = new MySmartPhone();
        cam.recordVideo();

        ObjectOrientedProgramming t = new ObjectOrientedProgramming();
        t.Calculate(20, 30);
        t.Calculate(20, 30, 50);

        MySmartPhone s = new MySmartPhone();
        s.sampleMath();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(7745);
        System.out.println(s.getA());
        System.out.println(s.getB());

    }

}
