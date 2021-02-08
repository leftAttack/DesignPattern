package CommandPattern;

/**
 * @author Yue_
 * @create 2021-02-06-22:30
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
