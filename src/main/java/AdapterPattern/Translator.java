package AdapterPattern;

/**
 * @author Yue_
 * @create 2021-02-04-17:31
 */
public class Translator implements Adapter{

    private Speaker speaker;

    public Translator(Speaker speaker){
        this.speaker = speaker;
    }

    public void translation(){
        speaker.speak();
        System.out.println("你好,世界");
    }
}
