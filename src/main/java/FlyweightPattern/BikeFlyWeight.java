package FlyweightPattern;

/**
 * @author Yue_
 * @create 2021-02-07-12:57
 */
abstract class BikeFlyWeight {

    //内部状态
    protected Integer status = 0;

    //userName为外部状态
    abstract public void ride(String userName);
    abstract public void back();

    public Integer getStatus(){
        return status;
    }
}
