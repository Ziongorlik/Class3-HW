// Exercise-7, 8, 9, 12
package animals;

public class Dog implements speech{
    public void bark(){
        System.out.println("whaf - Dog");
    }

    @Override
    public void talk(String sound) {
        System.out.println("barking sound!");
    }
}

interface speech {
    void talk(String sound);
}