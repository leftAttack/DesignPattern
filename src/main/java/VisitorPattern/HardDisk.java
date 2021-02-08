package VisitorPattern;

/**
 * @author Yue_
 * @create 2021-02-08-18:28
 */
public class HardDisk extends HardWare{

    public HardDisk(String command) {
        super(command);
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visitHardDisk(this);
    }
}
