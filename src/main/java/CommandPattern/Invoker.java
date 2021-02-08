package CommandPattern;

/**
 * @author Yue_
 * @create 2021-02-06-22:30
 */
public class Invoker {

    public static void main(String[] args) {
        ConcreteCommand concreteCommand = new ConcreteCommand(new Receiver());
        concreteCommand.excute();
    }
}
