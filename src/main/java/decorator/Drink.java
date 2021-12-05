package decorator;

/**
 * ClassName: Drink
 * Description:
 * date: 2021/12/5 上午9:05
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Drink {
    private String desc;
    private float price;

    public abstract float cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
