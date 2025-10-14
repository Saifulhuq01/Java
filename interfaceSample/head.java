package interfaceSample;

public class head {
    public static void main(String[] args) {
        interfacedemo obj1 = new interfaceclassImpl();
        interfacedemo obj2 = new interfaceclass2();

        obj1.returnsomething();
        obj1.alreadywrite();
        obj2.returnsomething();
        obj2.alreadywrite();

        interfacedemo2 obj3 = new interfacedemo2();
        obj3.test();
    }
}
