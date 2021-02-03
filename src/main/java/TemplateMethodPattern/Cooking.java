package TemplateMethodPattern;

/**
 * @author Yue_
 * @create 2021-02-03-16:22
 */
public class Cooking extends Cook{

    @Override
    void step1() {
        System.out.println("放西红柿和鸡蛋");
    }

    @Override
    void step2() {
        System.out.println("少放味精多放盐");
    }
}
