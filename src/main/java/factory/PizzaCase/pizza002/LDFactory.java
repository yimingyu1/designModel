package factory.PizzaCase.pizza002;

/**
 * ClassName: LDFactory
 * Description:
 * date: 2021/11/27 下午4:35
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class LDFactory implements AbsFactory{

    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("pepper")){
            pizza = new LDPepperPizza();
        } else if (pizzaType.equals("cheese")){
            pizza = new LDCheesePizza();
        }
        return pizza;
    }
}
