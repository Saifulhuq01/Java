package multithreading.lock.conditionLikeMonitorLockHave;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class sharedResources {
    //await() = wait() , signal() = notify();
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void producer(){
        try{
            lock.lock();
            System.out.println("producer acquire a lock: " + Thread.currentThread().getName());
            if(isAvailable){
                System.out.println("produce thread is waiting: "+ Thread.currentThread().getName());
                condition.await();
            }
            isAvailable= true;
            condition.signal();
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("producer lock released by: " + Thread.currentThread().getName());
        }
    }

    public void consume(){
        try{
            Thread.sleep(1000);
            lock.lock();
            System.out.println("consume acquire a lock: "+Thread.currentThread().getName() );

            if (!isAvailable){
                System.out.println("consume thread is waiting: "+ Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = false;
            condition.signal();
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("consume lock released by: " + Thread.currentThread().getName());
        }
    }

}
