package Builder;

/**
 * ClassName: CommonHouse
 * Description:
 * date: 2021/11/27 下午10:09
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("吊顶");
    }
}
