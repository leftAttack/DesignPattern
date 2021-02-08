package CompositePattern;

/**
 * @author Yue_
 * @create 2021-02-04-22:03
 */
public class Leaf implements Component{

    private int num = 0;

    public Leaf(int num){
        this.num = num;
    }

    @Override
    public int count() {
        return num;
    }
}
