package TemplateMethodPattern;

/**
 * @author Yue_
 * @create 2021-02-03-16:21
 */
abstract class Cook {

    abstract void step1();
    abstract void step2();

    public void template(){
        System.out.println("做饭开始");
        step1();
        step2();
        System.out.println("做饭结束");
    }
}
