package interfaceSample;

interface interfacedemotest1 {

    default boolean show(){
        return true;
    }
}
interface interfacedemotest2 {

    default boolean show(){
        return false;
    }
}

public class interfacedemo3 implements interfacedemotest1, interfacedemotest2 {
    public boolean show(){
        return true;
    }
}