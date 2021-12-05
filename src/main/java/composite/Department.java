package composite;

/**
 * ClassName: Department
 * Description:
 * date: 2021/12/5 上午10:34
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Department extends Organization{

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
