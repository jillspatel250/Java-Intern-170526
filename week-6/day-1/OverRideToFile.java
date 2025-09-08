import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OverRideToFile {
    public static void main(String[] args) {
        try{
            Path p= Paths.get("DataSet/newFile1.txt");
            //here we not create file because we use exits file we need to override content thats why

            String Content="www.einfochips.com";

            Files.write(p,Content.getBytes());
            System.out.println("Data Override as a Byte Array");


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
