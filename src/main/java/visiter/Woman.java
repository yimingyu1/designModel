package visiter;

/**
 * ClassName: Woman
 * Description:
 * date: 2021/12/8 下午10:54
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Woman extends Person{

    @Override
    public void accept(Action action) {
        action.getVoteResult(this);
    }
}
