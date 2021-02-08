package ChainRespPattern;

/**
 * @author Yue_
 * @create 2021-02-07-11:22
 */
public class Leader extends Chain{

    @Override
    public void process(Integer i) {
        if(i > 0 && i <= 10)
            System.out.println("Leader处理");
        else
            nextHandle.process(i);
    }
}
