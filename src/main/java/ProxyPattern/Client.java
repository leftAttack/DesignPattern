package ProxyPattern;

/**
 * @author Yue_
 * @create 2021-02-03-12:43
 */
public class Client {

    public static void main(String[] args) {
        Pursuit pursuit = new Pursuit();
        Proxy proxy = new Proxy(pursuit);
        proxy.wawa();
        proxy.flowers();
    }
}
