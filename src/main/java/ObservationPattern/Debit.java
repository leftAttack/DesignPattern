package ObservationPattern;

/**
 * @author Yue_
 * @create 2021-02-03-22:09
 */
public interface Debit {

    void borrow(Credit credit);
    void notifyCredit();
}
