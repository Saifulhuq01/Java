package multithreading.interMediateMonitorLockExam;

public class Main {
    public static void main(String[] args){
        System.out.println("Monitor Lock Example");
        monitorLockExample example = new monitorLockExample();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.task1();
            }
        });
        //alternative way of creating thread using lambda expression
        // System.out.println("Alternative way of creating thread using lambda expression");
        // Thread at1 = new Thread(()->{example.task1();});

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.task2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.task3();
            }
        });
        t1.start();
        // at1.start();
        t2.start();
        t3.start();
    }
}
