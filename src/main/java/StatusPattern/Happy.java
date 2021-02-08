package StatusPattern;

/**
 * @author Yue_
 * @create 2021-02-04-16:10
 */
public class Happy implements Status{
    @Override
    public void doWork() {
        System.out.println("开心早早的干完活了");
    }
}
