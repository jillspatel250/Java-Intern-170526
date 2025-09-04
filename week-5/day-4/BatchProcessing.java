//BatchProcessing using PreparStatement
import java.sql.*;
import java.util.Scanner;

public class BatchProcessing {
    public static void main(String[] args) {
        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learn";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established successfully");

            con.setAutoCommit(false); // disable auto-commit

            String query = "INSERT INTO employee(name, job_title, salary) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Name: ");
                String name = sc.nextLine();

                System.out.println("Job Title: ");
                String job_title = sc.nextLine();

                System.out.println("Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); // consume newline left by nextDouble()

                // set values in prepared statement
                pstmt.setString(1, name);
                pstmt.setString(2, job_title);
                pstmt.setDouble(3, salary);

                // add this set of values to batch
                pstmt.addBatch();

                System.out.println("Add more values Y/N: ");
                String decision = sc.nextLine();
                if (decision.equalsIgnoreCase("N")) {
                    break;
                }
            }

            // execute all batched statements together
            int[] batchResult = pstmt.executeBatch();
            con.commit(); // commit changes
            System.out.println("Batch executed successfully! " + batchResult.length + " rows inserted.");

            pstmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}