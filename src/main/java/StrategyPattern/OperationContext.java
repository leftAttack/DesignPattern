package StrategyPattern;

/**
 * @author Yue_
 * @create 2021-02-03-10:47
 */
public class OperationContext {

    Operation operation = null;

    public OperationContext(char operationChar){
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
    }

    public double getResult(double i , double j){
        return operation.calculation(i , j);
    }
}
