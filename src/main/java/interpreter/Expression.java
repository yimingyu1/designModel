package interpreter;

import java.util.Map;

/**
 * ClassName: Expression
 * Description:
 * date: 2021/12/11 下午7:02
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Expression {

    public abstract int interpreter(Map<String , Integer> map);
}
