import java.nio.file.Paths;
import java.util.Date;
import java.nio.file.*;
public class CopyFile {

    //Copy a File From One Location to Another Location
    public static void main(String[] args) {
        try{
            System.out.println("Started:"+ new Date());

            Path source= Paths.get("lesson-planning-application.zip");
            Path destination=Paths.get("/DataSet/lesson-planning-application-copy.zip");
            Files.copy(source,destination);

            System.out.println("Ended:"+ new Date());
            //650 MB nu folder che around 2 sec ma copy kari dese


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
