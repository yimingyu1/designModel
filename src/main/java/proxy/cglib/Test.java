package proxy.cglib;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/5 下午9:36
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = (Teacher)(new ProxyFactory(new Teacher()).getProxyInstance());
        System.out.println(teacher.teach());
    }
}
