package DecorationPattern;

/**
 * @author Yue_
 * @create 2021-02-03-11:59
 */
abstract class RobotDecoration implements Robot{

    Robot robot;

    public RobotDecoration(Robot robot){
        this.robot = robot;
    }

    @Override
    public void doSomeThings() {
        robot.doSomeThings();
    }

    abstract void doMoreThings();
}
