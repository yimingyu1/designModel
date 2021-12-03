package Builder;

/**
 * ClassName: AbstractHouse
 * Description:
 * date: 2021/11/27 下午10:08
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class AbstractHouse {

    private House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }

    public House buildHouse(){
        return house;
    }
}
