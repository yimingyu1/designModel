package Builder;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/27 下午10:10
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Builder1 builder1 = new Builder1(new CommonHouse());
        builder1.constructHouse();
    }
}
