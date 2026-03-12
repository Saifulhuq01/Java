package multithreading.lock.readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class sharedResources {
    boolean isAvailable = false;
    public void producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            Thread.sleep(4000);
            System.out.println("Read lock released by: "+ Thread.currentThread().getName());
        }catch (Exception e){

        }finally {
            lock.readLock().unlock();
//            System.out.println("Read lock released by: "+ Thread.currentThread().getName());
        }
    }

    public void consume(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = false;
            System.out.println("Write lock released by: "+ Thread.currentThread().getName());
        }catch (Exception e){

        }finally {

            lock.writeLock().unlock();
//            System.out.println("Write lock released by: "+ Thread.currentThread().getName());
        }
    }
}
