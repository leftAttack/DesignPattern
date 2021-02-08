package StatusPattern;

/**
 * @author Yue_
 * @create 2021-02-04-16:11
 */
public class Context {

    private Status status;

    public void setStatus(Status status){
        this.status = status;
    }

    public void doWorking(){
        status.doWork();
    }
}
