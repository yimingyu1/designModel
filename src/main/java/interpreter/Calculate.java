package interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * ClassName: Calculate
 * Description:
 * date: 2021/12/11 下午7:09
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Calculate {
    private String expStr;
    private Map<String, Integer> map;
    private Stack<Expression> stack;

    public Calculate(String expStr, Map<String, Integer> map){
        this.expStr = expStr;
        this.map = map;
        this.stack = new Stack<>();
    }

    public int calculate(){
        char[] charArray = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length ; i++){
            switch (charArray[i]){
                case '+':
                    left = this.stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    this.stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = this.stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    this.stack.push(new SubExpression(left, right));
                    break;
                default:
                    this.stack.push(new VarExpression(String.valueOf(charArray[i])));

            }
        }
        return this.stack.pop().interpreter(this.map);
    }
}
