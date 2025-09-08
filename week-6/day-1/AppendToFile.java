import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendToFile {
    public static void main(String[] args) {
        try{
            Path p= Paths.get("DataSet/newFile10.txt");
            //here we not create file because we use exits file we need to Append content thats why

            String Content="www.JillsPatel.com";

           //Files.write(p,Content.getBytes(), StandardOpenOption.CREATE);//if mewFile10 is not their then it create first
            Files.write(p,Content.getBytes(), StandardOpenOption.APPEND);//if we not enable this option then it will Override that..

            System.out.println("Data Append as a Byte Array");


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
