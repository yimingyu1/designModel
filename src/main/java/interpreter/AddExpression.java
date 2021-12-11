package interpreter;

import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.util.Map;

/**
 * ClassName: AddExpression
 * Description:
 * date: 2021/12/11 下午7:08
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return super.getLeft().interpreter(map) + super.getRight().interpreter(map);
    }
}

