package AbstractFactoryPattern;

/**
 * @author Yue_
 * @create 2021-02-04-15:58
 */
public class FactroyB implements AbstactFactory{
    @Override
    public Phone createPhone() {
        return new HuaWei();
    }

    @Override
    public Mask createMask() {
        return new KN95();
    }
}
