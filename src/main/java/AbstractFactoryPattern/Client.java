package AbstractFactoryPattern;

/**
 * @author Yue_
 * @create 2021-02-04-16:00
 */
public class Client {

    public static void main(String[] args) {
        AbstactFactory factroyA = new FactroyA();
        AbstactFactory factroyB = new FactroyB();

        Mask mask = factroyA.createMask();
        Phone phone = factroyA.createPhone();
        Mask mask1 = factroyB.createMask();
        Phone phone1 = factroyB.createPhone();

        System.out.println(mask);
        System.out.println(phone);
        System.out.println(mask1);
        System.out.println(phone1);

    }
}
