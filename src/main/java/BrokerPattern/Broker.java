package BrokerPattern;

/**
 * @author Yue_
 * @create 2021-02-07-11:38
 */
public interface Broker {

    void register(People people);

    void pair(People people);
}