import java.sql.*;
public class UpdateDataInDatabase {
    public static void main(String[] args) throws Exception{
        //load class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create Connection
        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learn";
        String query="UPDATE employee SET job_title='JAVA DEVELOPER' , salary='90000' WHERE id='1'";
        Connection con=DriverManager.getConnection(url,user,password);

        //create Statement
        Statement stmt=con.createStatement();
        int rowsAffected=stmt.executeUpdate(query);
        if (rowsAffected > 0) {
            System.out.println("Data is Updated correctly in table and "+ rowsAffected + " Rows is Affected");
        }else {
            System.out.println("Data is not inserted correctly in table check error");
        }

        stmt.close();
        con.close();


    }
}