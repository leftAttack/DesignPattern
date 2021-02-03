package StrategyPattern;

/**
 * @author Yue_
 * @create 2021-02-03-10:52
 */

//简单工厂模式我们需要让客户端认识两个类 Operation和OperationFactory
//策略模式结合工厂模式的用法,客户端就只需要认识一个类OperationContext就可以了,降低了耦合度
public class Client {

    public static void main(String[] args) {

        OperationContext operationContext = new OperationContext('+');
        System.out.println(operationContext.getResult(5, 10));

        OperationContext operationContext2 = new OperationContext('*');
        System.out.println(operationContext2.getResult(5, 10));

    }
}
