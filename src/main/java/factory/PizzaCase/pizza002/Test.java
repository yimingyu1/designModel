package factory.PizzaCase.pizza002;

import java.util.Calendar;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/27 下午4:39
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        BJFactory bjFactory = new BJFactory();
        new OrderPizza(bjFactory);
    }
}
