package BrokerPattern;

/**
 * @author Yue_
 * @create 2021-02-07-11:40
 */
class People {

    String name;
    int age;
    Sex sex;
    int requestAge; //要求对象的年龄
    Broker marriageBureau;

    public People(String name, int age, Sex sex, int requestAge, Broker marriageBureau) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.marriageBureau = marriageBureau;
    }

    public void findPartner(){
        marriageBureau.pair(this);
    }
}
