package multithreading.lock.semaphoreLock;

public class main {
    public static void main(String[] args){
        sharedResources resources = new sharedResources();
        Thread th1 = new Thread(()->{
            resources.producer();
        });
        Thread th2 = new Thread(()->{
            resources.producer();
        });
        Thread th3 = new Thread(()->{
            resources.producer();
        });
        Thread th4 = new Thread(()->{
            resources.producer();
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
