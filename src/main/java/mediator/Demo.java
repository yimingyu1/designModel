package mediator;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/11 下午4:48
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague alarm = new Alarm(mediator, ColleagueConstant.ALARM);
        Colleague tv = new TV(mediator, ColleagueConstant.TV);
        alarm.sendMessage(0);
        tv.sendMessage(1);
    }
}
