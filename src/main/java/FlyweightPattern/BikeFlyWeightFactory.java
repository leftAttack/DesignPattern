package FlyweightPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Yue_
 * @create 2021-02-07-12:58
 */
public class BikeFlyWeightFactory {

    private static BikeFlyWeightFactory bikeFlyWeightFactory = new BikeFlyWeightFactory();
    private Set<BikeFlyWeight> bikeFlyWeights = new HashSet<>();

    private BikeFlyWeightFactory(){
       for(int i = 0; i < 2; i++){
           bikeFlyWeights.add(new MobileBike(i + "号"));
       }
    }

    public static BikeFlyWeightFactory getInstance(){
        return bikeFlyWeightFactory;
    }

    public BikeFlyWeight getBike(){
        for(BikeFlyWeight bike : bikeFlyWeights){
            if (bike.status == 0){
                return bike;
            }
        }
        return null;
    }
}
