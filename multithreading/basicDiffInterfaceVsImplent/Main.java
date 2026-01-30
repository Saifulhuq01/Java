package multithreading.basicDiffInterfaceVsImplent;

public class Main {
    public static void main(String args[]){

        System.out.println("Going inside main for Interface method: " + Thread.currentThread().getName());
        mulitiThreadUseInterface obj1= new mulitiThreadUseInterface();
        Thread threadInterface = new Thread(obj1);
        threadInterface.start();
        System.out.println("end of main interface method: " + Thread.currentThread().getName());

        System.out.println("===================================================================");

        System.out.println("Going inside main for Extend method: " + Thread.currentThread().getName());
        multiThreadUseExtend obj2 = new multiThreadUseExtend();
        obj2.start();
        System.out.println("end of main extend method: "+ Thread.currentThread().getName());
    }
}
