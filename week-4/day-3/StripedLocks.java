//import com.google.common.util.concurrent.Striped;

import java.util.concurrent.locks.Lock;

public class  StripedLocks{

    public static void main(String[] args) {
        /*
        //max 10 locks j madse game etle object avi jay vadhare hase toh group ma lock assig thase group-1 lock 1...
        Striped<Lock> stripedLocks=Striped.lock(10);
        void update(Bag bag){
            Lock lock=stripedLocks.get(bag.getId());//kayu lock levanu che for particlular bag thar we find from this
            //this is find ke kaya bag ne kayu lock apovanu che its find based on the hashcode of that object
            //formula lock number= Hashcode % stipes

            //from here we use that lock number example we habe lock number 3 so we aquire that and use that and unlock that after that
            lock.lock();
            if(!bag.hasBlueCandy()){
                bag.add(new Candy("blue"));
            }
            lock.unlock();
        }

         */
    }
}
