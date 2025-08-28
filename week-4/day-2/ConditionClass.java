//see this code on image:-Condition class exammple

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static javax.swing.plaf.synth.ColorType.MAX_COUNT;

/*
added is for a produced when
removed is for consumer if consumer removed all after reading then it signal rempved.signal

simple term:-
Producer(){
    while(count==MAX_COUNT){ buffer full che means consumer e kasu consume nathi karyu
    removed.await(); //so jya sudhi consumer badhu remooved na kari dey means jya sudhi consume na kari dey tya sudhi wait karo
                    jyare consumer badhu removed kari dese tyare e update karse tyare aagad dataadd karse

    addData();
    added.signal(); //after added data added signal kari dese toh consumer side consumer wait karto hase added nu toh e tya thi wait mathi barr avine get karva mandse
}

Consumer(){
    while(count==0){ //khali che kasu nathi nakhyu
         added.await(); //jya sudhi produced add karse tya sudhi wait karse
         getData();
         removed.signal(); //data get kari ledho or cache mathi removed kari dedho then signal removed... so producer pacha write karva mande...
    }



}





private static final Lock lock=new ReentrantLock();
Condition added=lock.newCondition();
Condition removed=lock.newCondition();

public void produce() throws InterruptedException{
    lock.lock();
    int count = 0;
    try{

        while (count==MAX_COUNT){
            removed.await();
            addData();
        }
    }finally {
        lock.unlock();
    }
}

public String consume() throws InterruptedException{
    lock.unlock();
    int count=0;
    try {
        while (count==0)
            added.wait();
    }
}


public class Code1 {
    public static void main(String[] args) {

    }
}
*/


