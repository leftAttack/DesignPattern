package VisitorPattern;

/**
 * @author Yue_
 * @create 2021-02-08-18:31
 */
public class Update implements Visitor{

    @Override
    public void visitCPU(CPU cpu) {
        cpu.command += "1 + 1 = 2";
    }

    @Override
    public void visitHardDisk(HardDisk hardDisk) {
        hardDisk.command += "记住:1 + 1 = 2";
    }
}
