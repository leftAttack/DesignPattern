package FacedePattern;

/**
 * @author Yue_
 * @create 2021-02-03-16:57
 */
public class Facade {

    SubSystemOne subSystemOne = new SubSystemOne();
    SubSystemTwo subSystemTwo = new SubSystemTwo();
    SubSystemThree subSystemThree = new SubSystemThree();

    public void facade(){
        subSystemOne.one();
        subSystemTwo.two();
        subSystemThree.three();
    }
}
