package proxy.staticProxy;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/5 下午8:23
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        new TeacherProxy(new Teacher()).teach();
    }
}
