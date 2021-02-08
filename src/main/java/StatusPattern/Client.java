package StatusPattern;

/**
 * @author Yue_
 * @create 2021-02-04-16:12
 */
public class Client {

    public static void main(String[] args) {
        Context zhangsan = new Context();
        zhangsan.setStatus(new Happy());
        zhangsan.doWorking();
        System.out.println("*******************");
        zhangsan.setStatus(new Angry());
        zhangsan.doWorking();
    }
}
