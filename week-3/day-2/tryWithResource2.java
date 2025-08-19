import java.io.FileReader;

public class tryWithResource2 {
    static int meth1() throws Exception{
        try(FileReader f=new FileReader("jills.txt")){
            f.read();
        }catch(Exception e){
            System.out.println("file not found");
        }
        return 0;
    }
    public static void main(String[] args) {
        try{
        System.out.println(meth1());
        }catch(Exception e){
            System.out.println("meth1 method throw error handle here!!!");
        }
    }
    
}