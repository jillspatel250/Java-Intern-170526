//we can write multiple catch block ....

public class tryCatch1 {
    static void main1() throws Exception{
        try{

        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("this block is always execute");
        }
    }
    public static void main(String[] args) throws Exception{
        main1();
    }
    
}