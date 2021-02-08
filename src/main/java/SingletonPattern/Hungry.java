package SingletonPattern;

/**
 * @author Yue_
 * @create 2021-02-06-21:18
 */
public class Hungry {

    private Hungry instance = new Hungry();

    private Hungry(){

    }

    public Hungry getInstance(){
        return instance;
    }
}
