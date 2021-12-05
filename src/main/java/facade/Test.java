package facade;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/5 下午7:02
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.open();
        facade.close();
    }
}
