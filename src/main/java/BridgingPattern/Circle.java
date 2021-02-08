package BridgingPattern;

/**
 * @author Yue_
 * @create 2021-02-06-21:40
 */
public class Circle extends Shape{

    public Circle(Color color){
        super(color);
    }

    @Override
    public void draw() {
       color.bepaint("圆形");
    }
}