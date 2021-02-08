package BridgingPattern;

/**
 * @author Yue_
 * @create 2021-02-06-21:38
 */
abstract class Shape {

    Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract void draw();

}
