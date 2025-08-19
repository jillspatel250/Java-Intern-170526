import java.io.FileReader;
import java.io.IOException;

public class trywithResource {
     static int meth1() throws Exception{
        FileReader f = null;
        try{
            f=new FileReader("my.txt");
            f.read();
        }catch(IOException e){
            System.out.println("file not found");
        }finally{//here we clean up resources
            f.close();
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(meth1());


    }    
}