package VisitorPattern;

/**
 * @author Yue_
 * @create 2021-02-08-18:32
 */
public class Client {

    public static void main(String[] args) {
        ErEgg erEgg = new ErEgg();
        erEgg.calc();
        erEgg.accept(new Update());
        erEgg.calc();
    }
}
