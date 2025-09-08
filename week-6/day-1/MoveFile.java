import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class MoveFile {
    //move file from one location to another location
    public static void main(String[] args) {
        try{
            System.out.println("Started :"+new Date());
            Path source= Paths.get("/Users/jillspatel/Desktop/lesson-planning-application.zip");
            Path destination=Paths.get("DataSet/moved-Lesson-Plan.zip");

            Files.move(source,destination);

            System.out.println("Ended :"+new Date());
            //650 MB nu folder che around 1 sec ma move kari dese



        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
