package interpreter;

import java.util.Map;

/**
 * ClassName: SubExpression
 * Description:
 * date: 2021/12/11 下午7:07
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return super.getLeft().interpreter(map) - super.getRight().interpreter(map);
    }
}
