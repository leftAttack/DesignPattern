package VisitorPattern;

/**
 * @author Yue_
 * @create 2021-02-08-18:26
 */
abstract class HardWare {

    public String command;

    public HardWare(String command){
        this.command = command;
    }

    public void run(){
        System.out.println(command);
    }

    public abstract void accept(Visitor visitor);
}
