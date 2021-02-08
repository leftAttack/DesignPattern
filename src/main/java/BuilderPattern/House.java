package BuilderPattern;

/**
 * @author Yue_
 * @create 2021-02-03-22:27
 */
public class House {

    private Window window;
    private Wall wall;
    private Door door;
    public static int num = 1;

    public static final class HouseBuilder {
        private Window window;
        private Wall wall;
        private Door door;

        private HouseBuilder() {
        }

        public static HouseBuilder aHouse() {
            return new HouseBuilder();
        }

        public HouseBuilder buildWindow(Window window) {
            this.window = window;
            return this;
        }

        public HouseBuilder buildWall(Wall wall) {
            this.wall = wall;
            return this;
        }

        public HouseBuilder buildDoor(Door door) {
            this.door = door;
            return this;
        }

        public House build() {
            House house = new House();
            house.window = this.window;
            house.door = this.door;
            house.wall = this.wall;
            return house;
        }
    }
}
