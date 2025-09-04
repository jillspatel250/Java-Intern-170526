import java.sql.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class HotelReservationSystem {
    private static final String user = "root";
    private static final String password = "Jills@2022";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/hotel_db";

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try{
            Connection con=DriverManager.getConnection(url,user,password);
            while (true){
                System.out.println();
                System.out.println("HOTEL MANAGERMENT SYSTEM");
                Scanner sc=new Scanner(System.in);
                System.out.println("1. Reserve a room");
                System.out.println("2. view Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservations");
                System.out.println("5. Delete Reservations");
                System.out.println("0. Exit");
                System.out.println("Choose an option: ");
                int choice=sc.nextInt();

                switch (choice){
                    case 1:
                        reserveRoom(con,sc);
                        break;
                    case 2:
                        viewReservations(con,sc);
                        break;
                    case 3:
                        getRoomNumber(con,sc);
                        break;
                    case 4:
                        updateReservation(con,sc);
                        break;
                    case 5:
                        deleteReservation(con,sc);
                    case 0:
                        exit(1);
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid Choice. Try Again");
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void reserveRoom(Connection con,Scanner sc){
            try{
                System.out.println("Enter Guest Name");
                String guestName=sc.next();
                System.out.println("Enter room number");
                int roomNo=sc.nextInt();
                System.out.println("Enter a Contact Number");
                String contactNo=sc.next();

                String sql="INSERT INTO Reservation (guest_name,room_number,contact_number) " +
                        "VALUES ('" + guestName + "' , '" + roomNo +"' , '" + contactNo + "')";

                try{
                            Statement stmt=con.createStatement();
                            int rowsAffected=stmt.executeUpdate(sql);
                            if(rowsAffected > 0){
                                System.out.println("Reservation Successful");
                            }else {
                                System.out.println("Reservation FAILED");
                            }
                }catch (SQLException e){
                    System.out.println(e);
                }
            }catch (Exception e){
                System.out.println(e);
            }


    }

    public static void viewReservations(Connection con,Scanner sc){

        String sql="SELECT * from reservation";
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            System.out.println("Current Reservations:");
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
            System.out.println("| Reservation ID | Guest           | Room Number   | Contact Number      | Reservation Date        |");
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");

            while (rs.next()){
                int reservation_id=rs.getInt(1);
                String guest_name=rs.getString(2);
                int room_number=rs.getInt(3);
                String contact_number=rs.getString(4);
                String reservation_date=rs.getTimestamp("reservation_date").toString();

                System.out.printf("%-14d %-20s %-13d %-20s %-19s%n",
                        reservation_id, guest_name, room_number, contact_number, reservation_date);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void getRoomNumber(Connection con,Scanner sc){

        try{
            System.out.println("Enter Reservation ID");
            int reservationId=sc.nextInt();
            System.out.println("Enter guest name");
            String guestName=sc.next();

            String sql="SELECT room_number FROM reservation" + " WHERE reservation_id= " + reservationId + " AND guest_name= '" + guestName + "'";

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);

            if (rs.next()) {
                int roomNumber = rs.getInt("room_number");
                System.out.println("Room number for Reservation ID " + reservationId +
                        " and Guest " + guestName + " is: " + roomNumber);
            } else {
                System.out.println("Reservation not found for the given ID and guest name.");
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void updateReservation(Connection con,Scanner sc){

    }
    public static void deleteReservation(Connection con,Scanner sc){
            try {
                System.out.print("Enter reservation ID to delete: ");
                int reservationId = sc.nextInt();

                if (!reservationExists(con, reservationId)) {
                    System.out.println("Reservation not found for the given ID.");
                    return;
                }

                String sql = "DELETE FROM reservation WHERE reservation_id = " + reservationId;

                try (Statement statement = con.createStatement()) {
                    int affectedRows = statement.executeUpdate(sql);

                    if (affectedRows > 0) {
                        System.out.println("Reservation deleted successfully!");
                    } else {
                        System.out.println("Reservation deletion failed.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


    }
    public static boolean reservationExists(Connection con,int reservationId){
        try{
            String sql="SELECT reservation_id from reservation WHERE reservation_id = " + reservationId;

            try(Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(sql)){
                return rs.next();//if hase toh true return karse and resevation nai hoy toh false return karse

            }
        }catch (SQLException e){
            System.out.println(e);
            return false;
        }
    }
}