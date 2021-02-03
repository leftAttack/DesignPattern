package FactoryPattern;

import EasyFactoryPattern.Operation;

/**
 * @author Yue_
 * @create 2021-02-03-16:04
 */
public class AddFactroy implements Factory{

    @Override
    public Operation createOperation() {
        return new Add();
    }
}
