package interfaceSample;


public interface interfacedemo {

    public void returnsomething();

    public default void alreadywrite(){
        System.out.println("im in inner interface");
    }
}
abstract class interfaceclass implements interfacedemo {
   public void returnsomething(){
        System.out.println("im in  interfaceclass");
    }

    public abstract void alreadywrite();
}
class interfaceclassImpl extends interfaceclass{
    public void alreadywrite(){
        System.out.println("im in subclass");
    }
}

class interfaceclass2 implements interfacedemo{
    public void returnsomething(){
    System.out.println("im in interfaceClass2");}

    public void alreadywrite(){
        System.out.println("test2");
    }
}
