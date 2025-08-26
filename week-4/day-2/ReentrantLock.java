import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {
    private static ReentrantLock lock=new ReentrantLock();

    public static void accessResource() {
        try {
            lock.lock();
            lock.lock();
            lock.lock();
            int number = lock.getHoldCount();// ans is 3
            System.out.println(number);
            //access the resource
        }finally {//best to write the unlock in finally block so always lock is unlock after operations.
            //so other thread cannot wait for infinte time...
            lock.unlock();

        }
    }
    public static void accessResource2(){
        lock.lock();

        // do some operations
        int i=3;
        if(i>=3){
            accessResource2();//reenter in that block same block thats why we lock call reetrant..
        }
        System.out.println(lock.getHoldCount());
        lock.unlock();
    }
    //insted of this we use also sync block
    public void accessResource1() { //here we not make method is static
        synchronized (this){//<- this is lock
            //access the resource
        }//<- this is unlock

    }
    public static void main(String[] args) {
        //four t1,t2,t3,t4 are accessing accessResource() but we have lock so only one get that accessResource() and other are in waiting state
        //example t1 get accessResource() so after t1 access that and unlock that then another 3 go in runnable state
        //from 3 any 1 get lock and do operation and 2 are go in waiting state...
        Thread t1=new Thread(()->accessResource2()); t1.start();
        Thread t2=new Thread(()->accessResource2()); t2.start();
        Thread t3=new Thread(()->accessResource()); t3.start();
        Thread t4=new Thread(()->accessResource()); t4.start();
    }
}