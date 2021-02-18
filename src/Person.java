// Exercise-2
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this.name = name;
        name = name;
    }

    public void printName(String name){
        System.out.println("Name is: " + name);
    }
}
