package factory.PizzaCase;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ClassName: OrderPizza
 * Description:
 * date: 2021/11/27 下午2:58
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class OrderPizza {


    public OrderPizza(){
        PizzaCase1 pizzaCase1 = null;
        while (true){
            String pizzaType = getType();
            pizzaCase1 = SimpleFactory.getInstance().createPizza(pizzaType);
            if (pizzaCase1 == null){
                break;
            }
            pizzaCase1.bake();
            pizzaCase1.cut();
            pizzaCase1.box();
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
