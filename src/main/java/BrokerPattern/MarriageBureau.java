package BrokerPattern;

import java.util.ArrayList;

/**
 * @author Yue_
 * @create 2021-02-07-11:39
 * @introduce 婚姻介绍所
 */
public class MarriageBureau implements Broker{

    private ArrayList<People> peoples = new ArrayList<>();

    @Override
    public void register(People people) {
        peoples.add(people);
    }

    @Override
    public void pair(People people) {
       peoples.forEach((people1) -> {
          if(people.sex != people1.sex && people.age == people1.requestAge){
              System.out.println("将" + people.name + "与" + people1.name + "送入洞房");
          }
       });
    }
}
