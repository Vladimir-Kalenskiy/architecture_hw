package Task2;

public class Main {
    public static void main(String[] args) {

        Igreet greet = new InformalGreet();
        greet.greet();
        Igreet greet2 = new FormalGreet();
        greet2.greet();
    }
}
