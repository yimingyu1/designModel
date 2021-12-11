package state;

/**
 * ClassName: DispenseState
 * Description:
 * date: 2021/12/11 下午9:23
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class DispenseState extends State{

    private Activity activity;

    public DispenseState(Activity activity){
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("请先领奖");
    }

    @Override
    public boolean raffle() {
        System.out.println("请先领奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("你的奖品是：xxx");
        if (this.activity.getCount() <= 0){
            this.activity.setCurrentState(this.activity.getDispenseOutState());
        } else {
            this.activity.setCurrentState(this.activity.getNoRaffleState());
        }
    }
}
