package multithreading.lock.stamped.optimisticReadWriteLock;


public class main {
    public static void main(String[] args) {
        sharedResources resources = new sharedResources();

        Thread th1 = new Thread(()-> {
            resources.producer();
        });

        Thread th2 = new Thread(()->{
            resources.producer();
        });

        sharedResources resources1 = new sharedResources();
        Thread th3 = new Thread(()->{
            resources1.consume();
        });

        th1.start();
        th2.start();
        th3.start();
    }
}
