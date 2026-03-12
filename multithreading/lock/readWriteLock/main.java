package multithreading.lock.readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class main {
    public static void main(String[] args) {
        sharedResources resources = new sharedResources();
        ReadWriteLock Lock = new ReentrantReadWriteLock();

        Thread th1 = new Thread(()-> {
            resources.producer(Lock);
        });

        Thread th2 = new Thread(()->{
            resources.producer(Lock);
        });

        sharedResources resources1 = new sharedResources();
        Thread th3 = new Thread(()->{
            resources1.consume(Lock);
        });

        th1.start();
        th2.start();
        th3.start();
    }

}
