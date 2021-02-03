package DecorationPattern;

/**
 * @author Yue_
 * @create 2021-02-03-12:01
 */
public class Client {

    public static void main(String[] args) {
        RobotDecoration robotDecoration = new ConcreteDecoration(new FirstRobot());
        robotDecoration.doMoreThings();
    }
}
