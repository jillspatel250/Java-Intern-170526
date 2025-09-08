import java.nio.*;
import java.nio.file.*;
import java.util.List;


public class readFromFile {
    public static void main(String[] args) {
        try{
            Path  p= Paths.get("DataSet/poem.txt");
            //just a single line no need of bufferreader and all concept
            List<String> data=Files.readAllLines(p);

            for(String s:data){
                System.out.println(s);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
