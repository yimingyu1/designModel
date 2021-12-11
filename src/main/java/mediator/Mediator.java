package mediator;

import iterator.College;

/**
 * ClassName: Mediator
 * Description:
 * date: 2021/12/11 下午5:21
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Mediator {

    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int state, String colleagueName);
}
