package Task4;

public class Main {
    public static void main(String[] args) {
        Worker worker = new RobotWorker();
        worker.work();
       // worker.eat(); // Здесь возникнет исключение UnsupportedOperationException
        HumanWorker worker2 = new HumanWorker();
        worker2.work();
        worker2.eat();

    }
}