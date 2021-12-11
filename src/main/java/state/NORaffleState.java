package state;

/**
 * ClassName: NORaffleState
 * Description:
 * date: 2021/12/11 下午9:13
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class NORaffleState extends State{

    private Activity activity;

    public NORaffleState(Activity activity){
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("开始参与抽奖，每次扣5分");
        activity.setCurrentState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("请先购买积分，才能参与抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("请先购买积分，才能参与抽奖");
    }
}
