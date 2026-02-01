package multithreading.interMediateMonitorLockExam;

public class monitorLockExample {
   public synchronized void task1(){
    System.out.println("Task 1 started");
    try{
        System.out.println("Task 1 is in progress...");
        Thread.sleep(5000);
        System.out.println("Task 1 is completed.");
    }
    catch(Exception e){
        System.out.println(e);
    }
   }

   public void task2(){
    System.out.println("Task 2 started");
    synchronized(this){
        System.out.println("Task 2 is in progress...");
    }
   }
   public void task3(){
    System.out.println("Task 3 started");
    System.out.println("Task 3 is in progress...");
    System.out.println("Task 3 ended");
    }
    }
