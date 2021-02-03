package FactoryPattern;

import EasyFactoryPattern.Operation;

/**
 * @author Yue_
 * @create 2021-02-03-16:06
 */
public class DivideFactory implements Factory{

    @Override
    public Operation createOperation() {
        return new Divide();
    }
}
