package state;

/**
 * ClassName: DispenseOutState
 * Description:
 * date: 2021/12/11 下午9:27
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class DispenseOutState extends State{

    private Activity activity;

    public DispenseOutState(Activity activity){
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已结束");
    }

    @Override
    public boolean raffle() {
        System.out.println("已结束");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("已结束");
    }
}
