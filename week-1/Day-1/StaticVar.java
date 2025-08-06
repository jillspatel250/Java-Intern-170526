public class StaticVar {
    static int staticVar = 300;  // Static variable

    public void show() {
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        StaticVar obj1 = new StaticVar();
        obj1.show();

        StaticVar obj2 = new StaticVar();
        obj2.staticVar = 500;  //changing via one object affects all
        obj2.show();

        obj1.show();
        System.out.println("Access via class name: " + StaticVar.staticVar);
    }
}
