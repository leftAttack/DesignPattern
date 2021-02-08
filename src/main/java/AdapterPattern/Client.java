package AdapterPattern;

/**
 * @author Yue_
 * @create 2021-02-04-17:32
 */
public class Client {

    public static void main(String[] args) {
        Translator translator = new Translator(new Speaker());
        translator.translation();
    }
}
