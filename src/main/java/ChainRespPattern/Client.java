package ChainRespPattern;

/**
 * @author Yue_
 * @create 2021-02-07-11:23
 */
public class Client {

    public static void main(String[] args) {
        Leader leader = new Leader();
        Boss boss = new Boss();
        leader.setNextHandle(boss);

        leader.process(10);
        leader.process(11);
    }
}
