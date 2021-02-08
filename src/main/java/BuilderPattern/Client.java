package BuilderPattern;

/**
 * @author Yue_
 * @create 2021-02-03-22:31
 */
public class Client {

    public static void main(String[] args) {
        House.HouseBuilder.aHouse().buildWindow(new Window()).buildWall(new Wall()).buildDoor(new Door()).build();
    }
}
