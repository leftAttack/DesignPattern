package StatusPattern;

/**
 * @author Yue_
 * @create 2021-02-04-16:10
 */
public class Sad implements Status{
    @Override
    public void doWork() {
        System.out.println("伤心无精打采的干活");
    }
}
