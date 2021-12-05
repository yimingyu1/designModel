package decorator;

import com.sun.tools.internal.xjc.Driver;

/**
 * ClassName: Coffee
 * Description:
 * date: 2021/12/5 上午9:06
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return getPrice();
    }
}
