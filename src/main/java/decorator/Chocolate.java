package decorator;

/**
 * ClassName: Chocolate
 * Description:
 * date: 2021/12/5 上午9:11
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        this.setDesc("巧克力");
        this.setPrice(3.0f);
    }
}
