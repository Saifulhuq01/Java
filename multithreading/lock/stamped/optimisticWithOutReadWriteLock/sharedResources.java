package multithreading.lock.stamped.optimisticWithOutReadWriteLock;

import java.util.concurrent.locks.StampedLock;

public class sharedResources {
    int a= 10;
    StampedLock lock = new StampedLock();
    public void producer(){
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("taken optimistic lock");
            a =11;
            Thread.sleep(6000);
            if (lock.validate(stamp)){
                System.out.println("updated Successfully");
            }else{
                System.out.println("rollback a lock");
                a=10;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //here there is no finally because here no need to unlock here
//        }finally {
//
//        }
    }

    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by: "+ Thread.currentThread().getName());

        try{
            System.out.println("performing something");
            a=9;
        }finally {
            lock.unlockWrite(stamp);
            System.out.println("write lock released by: "+ Thread.currentThread().getName());
        }
    }
}
