package decorator;

/**
 * ClassName: Milk
 * Description:
 * date: 2021/12/5 上午9:10
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        this.setDesc("牛奶");
        this.setPrice(2.0f);
    }
}
