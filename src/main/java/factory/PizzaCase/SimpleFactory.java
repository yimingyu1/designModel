package factory.PizzaCase;

/**
 * ClassName: SimpleFactory
 * Description:
 * date: 2021/11/27 下午3:17
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SimpleFactory {

    private static SimpleFactory simpleFactory;

    public PizzaCase1 createPizza(String pizzaType){
        PizzaCase1 pizzaCase1 = null;
        if (pizzaType.equals("greek")){
            pizzaCase1 = new GreekPizza();
            pizzaCase1.setName("greek");
        } else if (pizzaType.equals("cheese")){
            pizzaCase1 = new CheesePizza();
            pizzaCase1.setName("cheese");
        }
        return pizzaCase1;
    }

    private SimpleFactory(){}

    public static SimpleFactory getInstance(){
        if (simpleFactory == null){
            synchronized (SimpleFactory.class){
                if (simpleFactory == null){
                    simpleFactory = new SimpleFactory();
                }
            }
        }
        return simpleFactory;
    }
}
