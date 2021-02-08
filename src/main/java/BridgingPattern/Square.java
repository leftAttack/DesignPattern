package BridgingPattern;

/**
 * @author Yue_
 * @create 2021-02-06-21:40
 */
public class Square extends Shape{

    public Square(Color color){
        super(color);
    }

    @Override
    public void draw() {
        color.bepaint("正方形");
    }
}
