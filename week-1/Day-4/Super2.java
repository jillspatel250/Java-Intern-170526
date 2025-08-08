class Device {
    String name = "Generic Device";

    // Parent class constructor
    Device(String type) {
        System.out.println("Device constructor: " + type);
    }

    // Parent class method
    void displayInfo() {
        System.out.println("Device info: " + name);
    }
}

class Mobile extends Device {
    String name = "Mobile Phone";

    // Child class constructor
    Mobile() {
        // Call parent constructor using super
        super("Electronic Gadget");
        System.out.println("Mobile constructor called");
    }

    // Overriding parent method
    @Override
    void displayInfo() {
        System.out.println("Mobile info: " + name);
        // Calling parent method using super
        super.displayInfo();
    }

    void showNames() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name); // Access parent variable
    }
}

public class Super2 {
    public static void main(String[] args) {
        Mobile m = new Mobile();

        m.displayInfo();

        m.showNames();
    }
}
