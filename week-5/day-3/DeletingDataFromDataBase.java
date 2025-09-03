import java.sql.*;
public class DeletingDataFromDataBase {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learn";
        String query="DELETE FROM employee WHERE salary='30000'";
        Connection con=DriverManager.getConnection(url,user,password);
        Statement stmt=con.createStatement();
        int rowsAffected=stmt.executeUpdate(query);
        if (rowsAffected > 0) {
            System.out.println("Operation is completed successfully "+rowsAffected+ " Rows Afected");
            String output = "SELECT * FROM employee";
            Statement stmt1 = con.createStatement();
            ResultSet rs = stmt1.executeQuery(output);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                int salary = rs.getInt("salary");

                System.out.println("---------------------------");
                System.out.println("ID is " + id);
                System.out.println("Name is " + name);
                System.out.println("job_title is " + job_title);
                System.out.println("Salary is " + salary);
            }
            rs.close();
            stmt1.close();
        }else{
            System.out.println("Operation Failed");
        }
        stmt.close();
        con.close();

        }







    }