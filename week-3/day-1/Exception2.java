
import java.util.Scanner;

class MinBalanceException extends Exception{
    public String toString(){
        return "your balance is < 1000 Add more money in bank account";
    }

}
public class Exception2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        try{
            if(amount<1000){
                throw new MinBalanceException();//throw that object of that class
            }else{
                System.out.println("Transaction Approved");

            }
        }
        catch(MinBalanceException e){
            System.out.println(e);
        }
    }
    
}