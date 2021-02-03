package EasyFactoryPattern;

/**
 * @author Yue_
 * @create 2021-02-03-10:45
 */
public class Add implements Operation {

    @Override
    public double calculation(double i , double j) {
        return i + j;
    }
}