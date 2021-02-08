package MemorandumPattern;

/**
 * @author Yue_
 * @create 2021-02-04-17:18
 */
public class Client {

    public static void main(String[] args) {

        Histroy histroy = new Histroy();
        Document document = new Document();
        document.change("abc");
        histroy.add(document.save());

        document.change("def");
        histroy.add(document.save());

        document.change("ghi");
        histroy.add(document.save());

        document.change("lmn");
        histroy.add(document.save());

        System.out.println("******开始撤销******");
        document.resume(histroy.getLastVersion());
        document.print();
        System.out.println("******第二次撤销******");
        document.resume(histroy.getLastVersion());
        document.print();
    }
}
