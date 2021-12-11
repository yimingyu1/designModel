package interpreter;

/**
 * ClassName: SymbolExpression
 * Description:
 * date: 2021/12/11 下午7:06
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class SymbolExpression extends Expression{
    private Expression left;
    private Expression right;

    public SymbolExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
