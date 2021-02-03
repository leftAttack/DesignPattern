package EasyFactoryPattern;

/**
 * @author Yue_
 * @create 2021-02-03-10:52
 */
public class Client {

    public static void main(String[] args) {

        Operation operation = OperationFactory.getOperation('+');
        System.out.println(operation.calculation(5, 10));

        Operation operation2 = OperationFactory.getOperation('*');
        System.out.println(operation2.calculation(5, 10));

    }
}
