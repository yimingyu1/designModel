package factory.PizzaCase.pizza002;

import factory.PizzaCase.PizzaCase1;
import factory.PizzaCase.SimpleFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ClassName: OrderPizza
 * Description:
 * date: 2021/11/27 下午4:35
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class OrderPizza {

    public OrderPizza(AbsFactory absFactory){
        PizzaCase1 pizzaCase1 = null;
        Pizza pizza = null;
        while (true){
            String pizzaType = getType();
            pizza = absFactory.createPizza(pizzaType);
            if (pizza == null){
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    public String getType(){
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = in.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
