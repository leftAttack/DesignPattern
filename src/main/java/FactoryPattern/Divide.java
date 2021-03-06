package FactoryPattern;

import EasyFactoryPattern.Operation;

/**
 * @author Yue_
 * @create 2021-02-03-11:01
 */
public class Divide implements Operation {

    @Override
    public double calculation(double i, double j) {
        return i / j;
    }
}
