package visiter;

import java.time.Period;

/**
 * ClassName: Man
 * Description:
 * date: 2021/12/8 下午10:54
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getVoteResult(this);
    }
}
