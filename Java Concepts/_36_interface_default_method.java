// Java Default Methods
// This Program was created by Yatharth Chauhan

// Default methods In Java:
// An interface can have static and default methods.
// Default methods enable us to add new functionality to existing interfaces.
// This feature was introduced in java 8 to ensure backward compatibility while
// updating an interface.
// A class implementing the interface need not implement the default methods.
// Interfaces can also include private methods for default methods to use.
// You can easily override a default method like any other method of an
// interface.

interface MyCamera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Taking snap");
    }

    // public void record4KVideo(){
    // System.out.println("Taking snap and recoding in 4k");
    // }
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Yatharth", "Riya", "Sujal" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class _36_interface_default_method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
