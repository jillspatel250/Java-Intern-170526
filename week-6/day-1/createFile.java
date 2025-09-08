import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//in JAVAIO we use File object here we use PATH obj and main diff
//if in JAVAIO creation is file that return boolean so we need to catch that and return that..
//JAVA NIO throws error .. so it better

public class createFile {
    public static void main(String[] args) {
        try{
            Path p= Paths.get("Dataset/poem.txt");
            if (Files.exists(p)){
                System.out.println("File is exits");
            }else{
                Path filePath=Files.createFile(p);
                System.out.println("File is created at "+ filePath);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
