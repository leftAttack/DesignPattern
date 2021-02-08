package StatusPattern;

/**
 * @author Yue_
 * @create 2021-02-04-16:10
 */
public class Angry implements Status{
    @Override
    public void doWork() {
        System.out.println("生气了不干活了");
    }
}
