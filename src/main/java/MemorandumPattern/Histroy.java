package MemorandumPattern;

import java.util.Stack;

/**
 * @author Yue_
 * @create 2021-02-04-17:21
 */
public class Histroy {

    Stack<BackUp> stack = new Stack<>();

    public void add(BackUp backUp){
        stack.add(backUp);
    }

    public BackUp getLastVersion(){
        return stack.pop();
    }
}
