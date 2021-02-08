package BridgingPattern;

/**
 * @author Yue_
 * @create 2021-02-06-21:40
 */
public class Client {

    public static void main(String[] args) {
        Square square = new Square(new Blue());
        square.draw();
    }
}
