package Task5;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        IPrinter myPrinter = new Printer();
        myPrinter.print(myText);
    }
}