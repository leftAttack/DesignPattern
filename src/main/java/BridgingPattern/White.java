package BridgingPattern;

/**
 * @author Yue_
 * @create 2021-02-06-21:40
 */
public class White implements Color{

    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
