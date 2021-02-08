package VisitorPattern;

/**
 * @author Yue_
 * @create 2021-02-08-18:32
 */
public class ErEgg {

    private CPU cpu;
    private HardDisk hardDisk;

    public ErEgg(){
         cpu = new CPU("1 + 1 = 1");
         hardDisk = new HardDisk("记住:1 + 1 = 1");
    }

    public void calc(){
        cpu.run();
        hardDisk.run();
    }

    public void accept(Visitor visitor){
        cpu.accept(visitor);
        hardDisk.accept(visitor);
    }
}
