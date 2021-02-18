// Exercise-1
public class Horse {
    private String name;
    private int age;

    public Horse(String name) {
        this.name = name;
    }

    public Horse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
