package state;

/**
 * ClassName: State
 * Description:
 * date: 2021/12/11 下午9:12
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class State {
    public abstract void deductMoney();
    public abstract boolean raffle();
    public abstract void dispensePrize();
}
