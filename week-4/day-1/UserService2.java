//in first UserService we create two thread insted of this we create two thread here 10 thread is created
// all of that are running in their all runnable interface and all of their is created their all runnable task
//all of that is created their all dateformat object

public class UserService2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            int id = i;
            new Thread(() -> {
                String birthDate = new UserService2().birthDate(id);
                System.out.println(birthDate);
            }).start();
        }
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