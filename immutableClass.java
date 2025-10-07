import java.util.ArrayList;
import java.util.List;

final class myimmutable{
    private final String name;
    private final List<Object> petNameList;

    myimmutable(String name, List<Object> perNameList){
        this.name = name;
        this.petNameList = perNameList;
    }

    public String getName(){
        return name;
    }
    public List<Object> getPetNamObjects(){
        return new ArrayList<>(petNameList);
    }
}

class immutableClass{
    public static void main(String[] args) {
        List<Object> petname =  new ArrayList<>();
        petname.add("dog");
        petname.add("goat");

        myimmutable obj = new myimmutable("sai", petname);
        obj.getPetNamObjects().add("testing");//in result why this testing not showing because in sout i jusr obj.getpetname so this call new ArrayList<>(petNameList); alrady stored data in petnamelist
        System.out.println(obj.getPetNamObjects());
    }
}