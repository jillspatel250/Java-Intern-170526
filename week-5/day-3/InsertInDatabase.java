import java.sql.*;
public class InsertInDatabase {
    public static void main(String[] args) throws Exception{
        //load class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create Connection
        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learn";
        String query="INSERT INTO employee (id,name,job_title,salary) VALUES(5,'jills','python developer',30000) , (9,'Parthiv','SQL Developer',30000)";
        Connection con=DriverManager.getConnection(url,user,password);

        //create Statement
        Statement stmt=con.createStatement();
        int rowsAffected=stmt.executeUpdate(query);
        if (rowsAffected > 0) {
            System.out.println("Data is inserted correctly in table");
        }else {
            System.out.println("Data is not inserted correctly in table check error");
        }

        stmt.close();
        con.close();


    }
}