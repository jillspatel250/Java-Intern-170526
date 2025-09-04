import java.sql.*;
public class PreparedStatement1 {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learn";
        String query="SELECT * FROM Employee WHERE salary > ? AND job_title = ?  ";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established Successfully!!");
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setInt(1,5000);
            pstmt.setString(2,"JAVA DEVELOPER");
            ResultSet rs=pstmt.executeQuery();
            while (rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String jobTitle=rs.getString(3);
                int salary=rs.getInt(4);

                System.out.println("ID : "+ id);
                System.out.println("NAME : "+ name);
                System.out.println("JOB_TITLE "+ jobTitle);
                System.out.println("SALARY: "+salary);
            }
            rs.close();
            pstmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection Close Successfully");


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }






    }
}