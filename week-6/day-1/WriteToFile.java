import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            /*Path p= Paths.get("DataSet/newFile1.txt");
            Path donePath1=Files.createFile(p);

            String content="Hey Coding Owls";

            Files.write(donePath1,content.getBytes());
            System.out.println("Data Written as Byte Array");

             */

            Path p2=Paths.get("DataSet/newFiles2.txt");
           // System.out.println(p2);
            Path donePath2=Files.createFile(p2);
           // System.out.println(donePath2);

            Path p3=Paths.get("DataSet/poem.txt");
            List<String> data=Files.readAllLines(p3);

            Files.write(donePath2,data);

            System.out.println("Data Written in File Using List of String");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
