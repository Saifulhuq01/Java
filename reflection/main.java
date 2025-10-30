package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class main {
    public static void main(String[] args) throws ClassNotFoundException,NoSuchFieldException, IllegalAccessException {
        
        // Class classobj = Class.forName("reflection.reflectInClass");
        Class classobj = reflectInClass.class;

        System.out.println(classobj.getName());
        System.out.println(classobj.getDeclaringClass());
        System.out.println(Modifier.toString(classobj.getModifiers()));

        // Method[] methodsPublic = classobj.getMethods();
        // // if we using getmethods it will give all public methods including inherited methods so try to use getdeclaredmethods to get all methods including private methods
        // for(Method method:methodsPublic){
        //     System.out.println("public method getname :" +method.getName());
        //     System.out.println("public method returntype" +method.getReturnType());
        //     System.out.println("public method declaringclass :" +method.getDeclaringClass());
        //     System.out.println("******");
        // }

        Method[] methods = classobj.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(method.getDeclaringClass());
            System.out.println("******");
        }

        ////////////////////////////////////////////////////////////////////////
        /// getting fields  
        /// //////////////////////////////////////////////////////////////////////

        Field[] fields = classobj.getFields();
        // getFields() for public 
        for(Field field : fields){
            System.out.println("field getname"+ field.getName());
            System.out.println("field gettype"+ field.getType());
            System.out.println("*************************");
        }
        //setting vale in publ;ic field;
        reflectInClass newobj = new reflectInClass();
        Field setfields = classobj.getDeclaredField("fish");
        setfields.set(newobj, "fishing");
        System.out.println(newobj.fish);

         Field[] privateFields = classobj.getDeclaredFields();
        // getFields() for public 
        for(Field field : privateFields){
            System.out.println("privateFields getname"+ field.getName());
            System.out.println("privateFields gettype"+ field.getType());
            System.out.println("*************************");
        }



        
    }
}
