package multithreading.lock.stamped.optimisticWithOutReadWriteLock;

public class main {
    public static void main(String[] args) {
        sharedResources resources = new sharedResources();

        Thread th1 = new Thread(()->{
            resources.producer();
        });

        Thread th2 = new Thread(()->{
            resources.consumer();
        });

        th1.start();
        th2.start();
    }
}
