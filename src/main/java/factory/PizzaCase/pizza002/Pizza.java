package factory.PizzaCase.pizza002;

/**
 * ClassName: Pizza
 * Description:
 * date: 2021/11/27 下午4:06
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name + " - bake");
    }
    public void cut(){
        System.out.println(name + " - cut");
    }
    public void box(){
        System.out.println(name + " - box");
    }
    public void setName(String name){
        this.name = name;
    }
}
