public class Exception3 {
    static int area(int a,int b) throws Exception{
        if(a<0 || b<0){
            throw new Exception("a and b not be negative");
        }
        else{
            return a*b;
        }
    }

    static void meth1() throws Exception{
        try{
        int a=area(-10,5);
        System.out.println(a);
        }catch( Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        try{
        meth1();
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}