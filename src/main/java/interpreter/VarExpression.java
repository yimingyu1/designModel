package interpreter;

import java.security.Key;
import java.util.Map;

/**
 * ClassName: VarExpression
 * Description:
 * date: 2021/12/11 下午7:04
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class VarExpression extends Expression{

    private String key;

    public VarExpression(String key){
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return map.get(key);
    }
}
