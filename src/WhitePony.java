// Exercise-5
public class WhitePony extends Pony implements IsRunnable{
    public WhitePony(String name) {
        super(name);
    }

    public String getPonyColor() {
        return "White";
    }
    
    @Override
    public void run(){
        System.out.println("I'm running");
    }
}
