import java.nio.file.*;

public class createDirectory {
    public static void main(String[] args) {
            try{
                Path p= Paths.get("DataSet");
                if(Files.exists(p)){
                    System.out.println("Direcoty already exits");
                }else{
                    Path donePath=Files.createDirectories(p);
                    System.out.println("Directory Created at"+donePath.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}