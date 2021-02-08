package AbstractFactoryPattern;

/**
 * @author Yue_
 * @create 2021-02-04-15:58
 */
public class FactroyA implements AbstactFactory{

    @Override
    public Phone createPhone() {
        return new iPhone();
    }

    @Override
    public Mask createMask() {
        return new N95();
    }
}
