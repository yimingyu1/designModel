package decorator;

/**
 * ClassName: Decorator
 * Description:
 * date: 2021/12/5 上午9:08
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " " + getPrice() + " " + drink.getDesc();
    }
}
