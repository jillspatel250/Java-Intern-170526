
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a 1st number");
        int n=sc.nextInt();
        System.out.println("enter a 2nd number");
        int m=sc.nextInt();
        try{
            int c=n/m;
            System.out.println(c);

            int arr[]=new int[10];
            System.out.println(arr[100]);
            
        }catch(ArithmeticException e){
            System.out.println("Divide by zero" + e);
        }catch(InputMismatchException e){
            System.out.println("Enter int number from 0-9"+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound error"+e);
        }finally{
            System.out.println("Programm is end!!! this line always print whether is exception or not");
        }
        
    }
}