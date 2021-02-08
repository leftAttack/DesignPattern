package ChainRespPattern;

/**
 * @author Yue_
 * @create 2021-02-07-11:21
 */
abstract class Chain {

    protected Chain nextHandle;

    public void setNextHandle(Chain nextHandle){
        this.nextHandle = nextHandle;
    }

    public abstract void process(Integer i);

}
