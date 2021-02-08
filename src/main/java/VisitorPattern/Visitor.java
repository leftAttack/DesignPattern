package VisitorPattern;

/**
 * @author Yue_
 * @create 2021-02-08-18:26
 */
public interface Visitor {

    void visitCPU(CPU cpu);

    void visitHardDisk(HardDisk hardDisk);
}
