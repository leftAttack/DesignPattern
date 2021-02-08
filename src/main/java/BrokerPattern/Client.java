package BrokerPattern;

/**
 * @author Yue_
 * @create 2021-02-07-11:48
 */
public class Client {

    public static void main(String[] args) {
        MarriageBureau marriageBureau = new MarriageBureau();

        People giao桑 = new People("Giao桑", 18, Sex.MALE, 18, marriageBureau);
        People 迪丽热巴 = new People("迪丽热巴", 25, Sex.FEMALE, 25, marriageBureau);
        People 古力娜扎 = new People("古力娜扎", 20, Sex.FEMALE, 20, marriageBureau);
        People 杨幂 = new People("杨幂", 28, Sex.FEMALE, 28, marriageBureau);
        People 郭老师 = new People("郭老师", 18, Sex.FEMALE, 18, marriageBureau);

        marriageBureau.register(giao桑);
        marriageBureau.register(迪丽热巴);
        marriageBureau.register(古力娜扎);
        marriageBureau.register(杨幂);
        marriageBureau.register(郭老师);

        giao桑.findPartner();

    }
}
