package factory.PizzaCase.pizza002;

/**
 * ClassName: BJFactory
 * Description:
 * date: 2021/11/27 下午4:33
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class BJFactory implements AbsFactory{
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("pepper")){
            pizza = new BJPepperPizza();
        } else if (pizzaType.equals("cheese")){
            pizza = new BJCheesePizza();
        }
        return pizza;
    }
}
