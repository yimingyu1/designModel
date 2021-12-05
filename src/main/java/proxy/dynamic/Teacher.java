package proxy.dynamic;

/**
 * ClassName: Teacher
 * Description:
 * date: 2021/12/5 下午8:53
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Teacher implements ITeacher{
    @Override
    public int teach() {
        return 23;
    }
}
