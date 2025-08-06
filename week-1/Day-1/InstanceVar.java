public class InstanceVar {
    int InstanceVar = 100;  //instance variable

    public void display() {
        System.out.println("Instance Variable: " + InstanceVar);
    }

    public static void main(String[] args) {
        InstanceVar obj1 = new InstanceVar();
        obj1.display();

        // each object can have its own copy
        InstanceVar obj2 = new InstanceVar();
        obj2.InstanceVar = 200;
        obj2.display();
    }
}
