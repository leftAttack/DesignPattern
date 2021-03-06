package FactoryPattern;

import EasyFactoryPattern.Operation;

/**
 * @author Yue_
 * @create 2021-02-03-16:05
 */
public class SubtractFactory implements Factory{

    @Override
    public Operation createOperation() {
        return new Subtract();
    }
}