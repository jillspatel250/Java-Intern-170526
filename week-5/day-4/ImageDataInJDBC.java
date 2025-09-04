import java.io.*;
import java.sql.*;
public class ImageDataInJDBC {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/image_database ";
        //String image_path="/Users/jillspatel/Downloads/einfochips.jpeg";//this is jpeg format we need to convert that in binary format..
        //we have FileInputStream class aa game tene binary format ma convert kari dey..
        String folderPath="/Users/jillspatel/Downloads/";


        String query="INSERT INTO image_table(image_Data) VALUES(?)";
        String query2="SELECT image_data from image_table where image_id = (?)";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connection established succesfully!!!");
           /* FileInputStream fis=new FileInputStream(image_path);
            byte [] imageData=new byte[fis.available()];
            fis.read(imageData);

            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setBytes(1,imageData);
            int affectedRows=pstmt.executeUpdate();
            if(affectedRows > 0){
                System.out.println("Image Inserted Successfully");
                System.out.println(affectedRows +" Rows is affected");
            }else {
                System.out.println("Image not inserted");
            }

            */

            //image ne database mathi laine folder nakhiee..
            PreparedStatement pstmt=con.prepareStatement(query2);
            pstmt.setInt(1,1);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                byte [] image_data=rs.getBytes("image_data");
                String image_path=folderPath+"extractedImage.jpeg";
                OutputStream os=new FileOutputStream(image_path);
                os.write(image_data);
                System.out.println("Image Extract from database successfully");
            }else {
                System.out.println("Operation Failed");
            }





            System.out.println();
            System.out.println("Connection Close Successfully");


        }catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}