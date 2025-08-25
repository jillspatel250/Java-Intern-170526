//why we need to use ThreadPool??
//example we have two thread in this class then it work correctly
//when both thread is work then SimpleDateFormat obj is created by both thread

import java.text.SimpleDateFormat;

public class UserService1 {
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            String birthDate=new UserService1().birthDate(100);
            System.out.println(birthDate);
        }).start();

        new Thread(()->{
            String birthDate=new UserService1().birthDate(100);
            System.out.println(birthDate);
        }).start();
        Thread.sleep(1000);
    }
    public String birthDate(int userId){
        //this is all for understanding purpose
    // Date birthDate=birthDate(int id);
     SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    // return df.format(birthDate);
        return "s";
    }
}