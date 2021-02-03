package StrategyPattern;

/**
 * @author Yue_
 * @create 2021-02-03-11:00
 */
public class Multiply implements Operation {

    @Override
    public double calculation(double i, double j) {
        return i * j;
    }
}
