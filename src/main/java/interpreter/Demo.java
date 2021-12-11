package interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/11 下午6:21
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {
    public static void main(String[] args) {
        String expStr = "a+b+c-d";
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 7);
        map.put("c", 2);
        map.put("d", 6);
        Calculate calculate = new Calculate(expStr, map);
        System.out.println(calculate.calculate());
    }
}
