package decorator;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/5 上午9:05
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {
    public static void main(String[] args) {
        Drink order = new Decaf();
        System.out.println(order.cost());
        System.out.println(order.getDesc());
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());
    }
}
