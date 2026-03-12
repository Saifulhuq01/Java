package multithreading.lock.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        sharedResources resource1 = new sharedResources();

        Thread  th1 = new Thread(() ->{
            resource1.producer(lock);
        });

        sharedResources resource2 = new sharedResources();
        Thread  th2 = new Thread(() ->{
            resource2.producer(lock);
        });

        th1.start();
        th2.start();

    }
}
