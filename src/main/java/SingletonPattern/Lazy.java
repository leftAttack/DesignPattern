package SingletonPattern;

/**
 * @author Yue_
 * @create 2021-02-06-21:18
 */
public class Lazy {

    /*
    实例对象必须要用volatile修饰
    1.分配内存
    2.实例化对象
    3.指向刚分配的地址
    如果此时发生指令重排,2.3顺序互换,则会返回null
     */
    private volatile Lazy instance = null;

    private Lazy(){

    }

    public Lazy getInstance(){
        if (instance == null){
            synchronized (Lazy.class){
                if(instance == null){
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }
}
