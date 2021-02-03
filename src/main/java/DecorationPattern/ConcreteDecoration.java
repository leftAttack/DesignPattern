package DecorationPattern;

/**
 * @author Yue_
 * @create 2021-02-03-12:06
 */
public class ConcreteDecoration extends RobotDecoration{

    public ConcreteDecoration(Robot robot) {
        super(robot);
    }

    @Override
    void doMoreThings() {
        robot.doSomeThings();
        System.out.println("拖地");
        System.out.println("跳舞");
    }

}
