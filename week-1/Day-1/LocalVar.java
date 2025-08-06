public class LocalVar {
    public void show() {
        int localVar = 50;
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        LocalVar obj = new LocalVar();
        obj.show();
    }
}
