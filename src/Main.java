import animals.Dog;
import animals.Puppy;

public class Main {
    public static void main(String[] args) {
        // Exercise-1
        Horse horse = new Horse("misterED",10);
        System.out.println("The horse name is : " + horse.getName());

        // Exercise-2
        System.out.println("The output will be : \"Name is: sam\"");

        // Exercise-3
        System.out.println("The output will be \"Name is: josh\"");
        System.out.println("The reason is that in the setName() method the parameter accepts its own value and does not pass the value to the name variable of the object.");
        System.out.println(", The value of the object's variable \"Name\" will be printed, which was obtained when the object was initialized.");

        // Exercise-5
        WhitePony whitePony = new WhitePony("My Little Pony");
        whitePony.bite();
        System.out.println("Pony's color: " + whitePony.getPonyColor());

        // Exercise-6
        System.out.println("A class cannot inherit from more than one class");

        // Exercise-7
        System.out.println("The code will not compile because class Dog and class Apple are not in the same package.");
        System.out.println("To fix the problem, class Apple needs to import the class Dog and it's package:");
        System.out.println("import animals.Dog;");

        // Exercise-8
        System.out.println("The method bark() has protected access in animals.Dog, which means it's not visible to Apple who is a non-subclass outside the animals package. ");
        System.out.println("It can be fixed by changing the access level of bark() in the Dog class to public.");

        // Exercise-9
        System.out.println("The output will be \"Whaf\" - Puppy");

        // Exercise-10
        System.out.println("Encapsulation: Binding of data and functions together into a single unit such that they are kept both safe from outside interference and misuse");

        // Exercise-11
        System.out.println("* Cyclic Inheritance : If a class or interface inherits from itself, even directly (i.e., it appears as its super-class or in its list of super-interfaces)");
        System.out.println("or indirectly (i.e., one of its super-class or one of its super-interfaces inherits from it), a cyclic inheritance error is reported.");
        System.out.println("* It is not allowed in java");
        System.out.println("* Cyclic Inheritance example:");
        System.out.println("public class Person extends Employee{}");
        System.out.println("public class Employee extends Person{}");

        // Exercise-12
        // in class Dog
    }
}

