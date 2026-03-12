package multithreading.lock.stamped.optimisticReadWriteLock;

import java.util.concurrent.locks.StampedLock;

public class sharedResources {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp = lock.readLock();
        try{
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            Thread.sleep(6000);
            System.out.println("Read lock released by: "+ Thread.currentThread().getName());
        }catch (Exception e){

        }finally {
            lock.unlockRead(stamp);
//            System.out.println("Read lock released by: "+ Thread.currentThread().getName());
        }
    }

    public void consume(){
        long stamp = lock.writeLock();
        try{
            System.out.println("Write lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = false;
            System.out.println("Write lock released by: "+ Thread.currentThread().getName());
        }catch (Exception e){

        }finally {

            lock.unlockWrite(stamp);
//            System.out.println("Write lock released by: "+ Thread.currentThread().getName());
        }
    }
}
