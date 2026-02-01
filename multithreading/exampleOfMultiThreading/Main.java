package multithreading.exampleOfMultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started: " + Thread.currentThread().getName());
        sharedResources sr = new sharedResources();

        Thread producThread = new Thread(new producer(sr));
        Thread consumerThread = new Thread(new consumer(sr));

        producThread.start();
        consumerThread.start();

        System.out.println("Main thread ended: " + Thread.currentThread().getName());
    }
}
