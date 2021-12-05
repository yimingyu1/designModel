package proxy.staticProxy;

/**
 * ClassName: Teacher
 * Description:
 * date: 2021/12/5 下午8:27
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Teacher implements ITeacher{

    @Override
    public void teach() {
        System.out.println("teacher");
    }
}
