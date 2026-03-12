package multithreading.lock.semaphoreLock;

import java.util.concurrent.Semaphore;

public class sharedResources {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
            System.out.println("lock released by: "+ Thread.currentThread().getName());

        }catch (Exception e){

        }finally {
            lock.release();
//            System.out.println("lock released by: "+ Thread.currentThread().getName());
        }
    }
}
