package FlyweightPattern;

/**
 * @author Yue_
 * @create 2021-02-07-12:57
 */
public class MobileBike extends BikeFlyWeight{

    //车架号
    private String bikeId;

    public MobileBike(String bikeId){
        this.bikeId = bikeId;
    }

    @Override
    public void ride(String userName) {
        status = 1;
        System.out.println(userName + "骑走了" + bikeId + "号自行车");
    }

    @Override
    public void back() {
        status = 0;
        System.out.println( bikeId + "被归还了");
    }
}
