package FactoryPattern;

import EasyFactoryPattern.Operation;
import EasyFactoryPattern.OperationFactory;

/**
 * @author Yue_
 * @create 2021-02-03-10:52
 */
public class Client {

    public static void main(String[] args) {

        Factory factory = new AddFactroy();
        Operation operation = factory.createOperation();
        System.out.println(operation.calculation(10, 5));

        Factory factory2 = new MultiplyFactory();
        Operation operation2 = factory2.createOperation();
        System.out.println(operation2.calculation(10, 5));

    }
}
