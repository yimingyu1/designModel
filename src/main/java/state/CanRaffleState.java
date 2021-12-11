package state;

import java.util.Random;

/**
 * ClassName: CanRaffleState
 * Description:
 * date: 2021/12/11 下午9:19
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class CanRaffleState extends State{

    private Activity activity;

    public CanRaffleState(Activity activity){
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("您已购买过积分，可以开始抽奖了");
    }

    @Override
    public boolean raffle() {
        int result = new Random().nextInt(10);
        if (activity.getCount() > 0 && result == 0){
            System.out.println("恭喜你，中奖了");
            this.activity.setCount(this.activity.getCount() - 1);
            this.activity.setCurrentState(this.activity.getDispenseState());
            return true;
        }
        System.out.println("很遗憾，没中奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("请先抽奖");
    }
}
