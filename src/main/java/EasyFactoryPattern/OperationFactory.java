package EasyFactoryPattern;

/**
 * @author Yue_
 * @create 2021-02-03-10:47
 */
public class OperationFactory {

    public static Operation getOperation(char operationChar){
        Operation operation = null;
         switch (operationChar){
             case '+':
                 operation = new Add();
                 break;
             case '-':
                 operation = new Subtract();
                 break;
             case '*':
                 operation = new Multiply();
                 break;
             case '/':
                 operation = new Divide();
                 break;
         }
        return operation;
    }
}
