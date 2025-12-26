package collection.comparatorVsComparable;

import java.util.Arrays;
import java.util.List;

public class comparator {

    public static void main(String[] args) {

        System.out.println("================================ COMPARATOR \"I can compare two other objects\"==========================================");

        Integer a[] = {8,6,2,6,3,0,5,21,88,66,9};

        Arrays.sort(a, (Integer val1,Integer val2) -> val1 - val2);
        //0, 2, 3, 5, 6, 6, 8, 9, 21, 66, 88
        Arrays.sort(a, (Integer val1,Integer val2) -> val2 - val1);
        // 88, 66, 21, 9, 8, 6, 6, 5, 3, 2, 0
        for(int result :a){
            System.out.print(result + ", ");
        }


        carObject[] carArray =  new carObject[3];

        carArray[0] = new carObject("kia", "petrol");
        carArray[1] = new carObject("honda", "diesel");
        carArray[2] = new carObject("bmw", "EV");

        Arrays.sort(carArray, (carObject obj1, carObject obj2)->obj1.carName.compareTo(obj2.carName));//comparator
        // Arrays.sort(carArray);//comparable

        for(carObject car: carArray){
            System.out.println( car.carName);
        }

        System.out.println("================================ COMPARABLE  \"I can compare myself\" ==========================================");

        // if you are hard to understand these read this 
        // Imagine you are running a business and need to organize your staff files.
// 1. The Blueprint (class Employee)
// Think of this as a blank form. Every time you hire someone, you fill out this form with their id, name, and salary.
// public Employee(...): This is the Constructor. It’s just the act of filling out that form for a new person.
// 2. The "Brain" (implements Comparable)
// By default, Java is kind of dumb. If you give it two Employees, it doesn't know who should come first.
// implements Comparable<Employee>: This is you telling Java, "Hey, I’m going to teach these Employee objects how to compare themselves to one another."
// compareTo(Employee oEmployee): This is the Rulebook. You wrote a rule that says: "Look at my salary and look at the other guy's salary. Whoever has the smaller number goes first."
// 3. The "Translator" (toString)
// If you try to print an object in Java without this, it prints gibberish (like Employee@7a81197d).
// toString(): This tells Java, "Whenever I say 'print an employee,' just show me their ID, Name, and Salary as a normal sentence."
// 4. The "List" (Employee[] employees)
// This is just a folder (an Array) where you put 4 filled-out forms (objects) for Sai, Kumar, Rahul, and Anu. They are currently in a random order.
// 5. The "Magic Button" (Arrays.sort)
// This is the most important part:
// When you call Arrays.sort(employees), Java looks at the folder and says, "How do I sort these humans?"
// It remembers you gave the Employee a "Brain" (Comparable).
// It automatically runs your Rulebook (compareTo) behind the scenes.
// It compares the salaries: 40k vs 60k, 60k vs 80k, etc.
// 6. The "Output" (for (Employee e : employees))
// This loop just walks through the folder one by one and prints the names. Because of Arrays.sort, they are now perfectly lined up from the lowest salary to the highest.
// The result on your screen in 2025 will be:
// Kumar (40000)
// Anu (50000)
// Sai (60000)
// Rahul (80000)

         Employee[] employees = {
            new Employee(1, "Sai", 60000),
            new Employee(2, "Kumar", 40000),
            new Employee(3, "Rahul", 80000),
            new Employee(4, "Anu", 50000)
        };

        // Uses compareTo() automatically
        Arrays.sort(employees);

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("================================ COMPARABLE TEST ==========================================");
        
        int[] ArrayTest = {1,3,5,4,3,6,7,8,5,45,67,88};
        Arrays.sort(ArrayTest);

        for(int i=0; i< ArrayTest.length;i++){
            System.out.print(ArrayTest[i] + " ");
        }

    }
}