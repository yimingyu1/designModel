package factory.PizzaCase.pizza002;

/**
 * ClassName: AbsFactory
 * Description:
 * date: 2021/11/27 下午4:32
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public interface AbsFactory {

    Pizza createPizza(String type);
}
