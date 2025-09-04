import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {
    public static void main(String[] args) throws Exception{
        String user = "root";
        String password = "Jills@2022";
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_learn";
        String withdrawQuery="UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        String depositQuery="UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("connection established successfully!!!");
            con.setAutoCommit(false);//this means we dont want any thing is commit automatically... so we of autocommit
            try {
                PreparedStatement pstmtWithdraw = con.prepareStatement(withdrawQuery);
                PreparedStatement pstmtDeposit = con.prepareStatement(depositQuery);
                pstmtWithdraw.setDouble(1, 500.00);
                pstmtWithdraw.setString(2, "account456");
                pstmtDeposit.setDouble(1, 500.00);
                pstmtDeposit.setString(2, "account123");
               int rowsAffectedWithdrawl= pstmtWithdraw.executeUpdate();
               int rowsAffectedDeposit= pstmtDeposit.executeUpdate();
               if( rowsAffectedDeposit > 0 && rowsAffectedWithdrawl > 0) {
                   con.commit();
                   System.out.println("transaction successfull");
               }else{
                   con.rollback();
                   System.out.println("Transaction Failed");
               }
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e);

        }
    }

}