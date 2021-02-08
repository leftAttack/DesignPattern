package ObservationPattern;

import java.util.ArrayList;

/**
 * @author Yue_
 * @create 2021-02-03-22:10
 */
public class ZhangSan implements Debit{

    private ArrayList<Credit> allDebits = new ArrayList<>();
    private Integer status = 0; //1.表示有钱

    @Override
    public void borrow(Credit credit) {
        allDebits.add(credit);
    }

    @Override
    public void notifyCredit() {
        allDebits.forEach(credit -> {
            credit.takeMoney();
        });
    }
}
