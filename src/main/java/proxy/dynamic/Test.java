package proxy.dynamic;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/5 下午8:51
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        ITeacher teacher = (ITeacher)new Dynamic(new Teacher()).getTeacher();
        System.out.println(teacher.teach());

    }
}
