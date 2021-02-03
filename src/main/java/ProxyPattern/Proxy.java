package ProxyPattern;

/**
 * @author Yue_
 * @create 2021-02-03-12:43
 */
public class Proxy implements SendGifts{

    SendGifts sendGifts;

    public Proxy(SendGifts sendGifts){
        this.sendGifts = sendGifts;
    }

    @Override
    public void wawa() {
        System.out.println("包装一下");
        sendGifts.wawa();
    }

    @Override
    public void flowers() {
        System.out.println("包装一下");
        sendGifts.flowers();
    }
}
