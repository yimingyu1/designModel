package Builder;

/**
 * ClassName: Builder1
 * Description:
 * date: 2021/11/27 下午10:02
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Builder1 {

    private AbstractHouse abstractHouse;

    public Builder1(AbstractHouse abstractHouse){
        this.abstractHouse = abstractHouse;
    }

    public House constructHouse(){
        abstractHouse.buildBasic();
        abstractHouse.buildWalls();
        abstractHouse.roofed();
        return abstractHouse.buildHouse();
    }
}
