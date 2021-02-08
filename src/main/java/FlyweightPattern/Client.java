package FlyweightPattern;

/**
 * @author Yue_
 * @create 2021-02-07-12:58
 */
public class Client {

    public static void main(String[] args) {
        BikeFlyWeightFactory bikeFlyWeightFactory = BikeFlyWeightFactory.getInstance();
        BikeFlyWeight bike1 = bikeFlyWeightFactory.getBike();
        bike1.ride("zhangsan");

        BikeFlyWeight bike2 = bikeFlyWeightFactory.getBike();
        bike2.ride("lisi");
        bike2.back();

        BikeFlyWeight bike3 = bikeFlyWeightFactory.getBike();
        bike3.ride("wangwu");
        bike3.back();

        System.out.println(bike1 == bike2);
        System.out.println(bike2 == bike3);
    }

}
