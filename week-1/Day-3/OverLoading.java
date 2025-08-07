public class OverLoading {

    // no parameters
    public void display() {
        System.out.println("display method with no parameters");
    }

    // one int parameter
    public void display(int a) {
        System.out.println("display method with one int: " + a);
    }

    //two int parameters
    public void display(int a, int b) {
        System.out.println("display method with two ints: " + a + ", " + b);
    }

    // one String parameter
    public void display(String message) {
        System.out.println("display method with String: " + message);
    }

    public static void main(String[] args) {
        OverLoading obj = new OverLoading();

        obj.display();             
        obj.display(10);           
        obj.display(5, 15);         
        obj.display("Hello Java");  
    }
}
