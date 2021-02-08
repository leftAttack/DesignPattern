package BridgingPattern;

/**
 * @author Yue_
 * @create 2021-02-06-21:40
 */
public class Blue implements Color{

    @Override
    public void bepaint(String shape) {
        System.out.println("蓝色的" + shape);
    }
}
