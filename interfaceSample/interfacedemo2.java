package interfaceSample;

interface Innerinterfacedemo2 {
    public void test(); 
    // it can have only abstract methods
    abstract void display();
    
}
public class interfacedemo2 implements Innerinterfacedemo2{
    public void  test(){
        System.out.println("im in interfacedemo2");
    }
    public void display(){
        System.out.println("display method in interfacedemo2");
    }
}
