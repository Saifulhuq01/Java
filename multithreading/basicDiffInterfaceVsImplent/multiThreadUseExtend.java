package multithreading.basicDiffInterfaceVsImplent;

public class multiThreadUseExtend extends Thread{
    public void run(){
        System.out.println("code executed inside of Extend method: "+ Thread.currentThread().getName());
    }
}
