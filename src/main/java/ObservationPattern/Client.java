package ObservationPattern;

/**
 * @author Yue_
 * @create 2021-02-03-22:12
 */
public class Client {

    public static void main(String[] args) {

        Credit ZhaoSi = new Credit() {
            @Override
            public void takeMoney() {
                System.out.println("还赵四钱");
            }
        };

        Credit Wangwu = new Credit() {
            @Override
            public void takeMoney() {
                System.out.println("还王五钱");
            }
        };

        Credit LaoBa = new Credit() {
            @Override
            public void takeMoney() {
                System.out.println("还老八钱");
            }
        };

        ZhangSan zhangSan = new ZhangSan();
        zhangSan.borrow(ZhaoSi);
        zhangSan.borrow(Wangwu);
        zhangSan.borrow(LaoBa);
        //status状体改变
        zhangSan.notifyCredit();
    }
}
