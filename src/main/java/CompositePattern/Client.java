package CompositePattern;

/**
 * @author Yue_
 * @create 2021-02-04-22:04
 */
public class Client {

    public static void main(String[] args) {

        /*
        China
            |_北京
            |_上海
            |_山西
                |_大同
                |_太原
         */

        Composite china = new Composite();
        Leaf beiJing = new Leaf(1000);
        Leaf shangHai = new Leaf(2000);
        china.addComponent(beiJing);
        china.addComponent(shangHai);

        Composite shanXi = new Composite();
        Leaf daTong = new Leaf(3000);
        Leaf taiYuan = new Leaf(2000);
        shanXi.addComponent(daTong);
        shanXi.addComponent(taiYuan);

        china.addComponent(shanXi);

        System.out.println(china.count());
    }
}
