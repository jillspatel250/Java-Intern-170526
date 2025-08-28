//write prod consumer code without blocking queue
//solution:- we use locks in that and

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProdConsumerProb2 {
    private int max;
    private Queue<String> queue;
    private ReentrantLock lock=new ReentrantLock(true);
    private Condition notEmpty= lock.newCondition();
    private Condition notFull=lock.newCondition();

    public ProdConsumerProb2(int size){
        queue=new LinkedList<>();
        this.max=size;
    }

    //producer
    public void put(String e) throws InterruptedException {
        lock.lock();
        try{
            if(queue.size() == max){
                notFull.wait(); //consumer signal apse that is notFull means have kai bharo to signal nai ape ty a sudhi wait and jevu signal apdse pachi agad nu...
            }
            queue.add(e);
            notEmpty.signalAll();
        }finally {
            lock.unlock();
        }
    }

    //consumer
    public String take() throws InterruptedException {
        lock.lock();
        try{
            if(queue.size()==0){
                notEmpty.wait();//producer signal apse ke notEmpty etle have read karvnu chalu karo.. tya sudhi consumer wait karse signal nu
            }
        String item= queue.remove();
            notFull.signalAll();
            return item;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {


    }
}
