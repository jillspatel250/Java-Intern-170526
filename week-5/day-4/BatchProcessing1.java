//BatchProcessing using statement

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing1 {
    public static void main(String[] args) {
        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learn";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection con= DriverManager.getConnection(url,user,password);
            System.out.println("connection Establish successfully");
            con.setAutoCommit(false);//we set false becuase first we make the batch then we commit so etle initial we make autocommit off
            Statement stmt=con.createStatement();
            stmt.addBatch("INSERT INTO employee(name,job_title,salary) VALUES ('vashu','HR Manager',65000)");
            stmt.addBatch("INSERT INTO employee(name,job_title,salary) VALUES ('karan', 'Cyber Security Analysis',62000)");
            stmt.addBatch("INSERT INTO employee(name,job_title,salary) VALUES ('Vipul', 'DevOps Engineer',67000)");
            int [] batchResult=stmt.executeBatch();
            con.commit();
            System.out.println("Batch Executed Successfully!!!");








        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}