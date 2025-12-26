package comparatorVsComparable;

public class carObject {
    String carName;
    String carType;

    carObject(String name, String type){
        this.carName = name;
        this.carType = type;
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

     // NATURAL ORDER: by salary (ascending)
     public int compareTo(Employee oEmployee){
        return Integer.compare(this.salary, oEmployee.salary);
     }

    public String toString(){
        return id + " " + name + " " + salary;
    }

}