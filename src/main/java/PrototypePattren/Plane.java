package PrototypePattren;

/**
 * @author Yue_
 * @create 2021-02-03-15:52
 */
public class Plane implements Clone{

    private String name;
    private String type;

    public Plane() {
        name = "Name" + Math.random();
        type = "Type" + Math.random();
    }

    public Plane(Plane plane) {
        this.name = plane.name;
        this.type = plane.type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        return new Plane(this);
    }
}
