package PrototypePattren;

/**
 * @author Yue_
 * @create 2021-02-03-15:54
 */
public class Client {

    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane planeClone = (Plane) plane.clone();
        System.out.println(plane);
        System.out.println(planeClone);
    }
}
