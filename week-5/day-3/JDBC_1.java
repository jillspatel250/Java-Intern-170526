import java.sql.*; //import driver
public class JDBC_1 {
    public static void main(String[] args){
        //je driver import karyu che ene load karvu..
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        //after loading driver ..make connection
        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learn";
        String query="SELECT * FROM Employee";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established Successfully");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String job_title=rs.getString("job_title");
                int salary=rs.getInt("salary");

                System.out.println("---------------------------");
                System.out.println("ID is "+id);
                System.out.println("Name is "+name);
                System.out.println("job_title is "+job_title);
                System.out.println("Salary is "+salary);

            }
            rs.close();
            stmt.close();
            con.close();
            System.out.println("ALL connection are closed..");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }






    }
}