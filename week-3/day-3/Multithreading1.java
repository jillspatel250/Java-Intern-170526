//multithreading using Runnable interface
//in this we run using obj.run()
class MyThread implements Runnable{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

public class Multithreading1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        Thread m=new Thread(t);
        m.start();
        int i=0;
        while(true){
            System.out.println(i+"World");
            i++;
        }
        
    }
    
}
