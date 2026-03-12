package multithreading.lock.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class sharedResources {
    boolean isAvailable = false;

    public void producer(ReentrantLock lock){

        try{
            lock.lock();
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("Lock released by: " + Thread.currentThread().getName());
        }
    }
}
