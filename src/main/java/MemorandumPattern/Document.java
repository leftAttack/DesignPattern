package MemorandumPattern;

/**
 * @author Yue_
 * @create 2021-02-04-17:17
 */
public class Document {

    private String context;

    public BackUp save(){
        return new BackUp(context);
    }

    public void resume(BackUp backUp){
        context = backUp.context;
    }

    public void change(String context){
        this.context = context;
    }

    public void print(){
        System.out.println(context);
    }
}
