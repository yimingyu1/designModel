package state;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/11 下午8:43
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {
    public static void main(String[] args) {
        Activity activity = new Activity(5);
        for (int i = 0; i < 300; i++){
            activity.deductMoney();
            activity.raffle();
        }
        System.out.println(activity.getCount());
    }
}
