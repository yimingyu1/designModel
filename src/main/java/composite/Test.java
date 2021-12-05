package composite;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/5 上午10:21
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Organization university = new University("清华大学", "清华大学");
        Organization computerCollege = new College("计算机学院", "计算机学院");
        Organization infoEngineerCollege = new College("信息工程学院", "信息工程学院");
        university.add(computerCollege);
        university.add(infoEngineerCollege);
        computerCollege.add(new Department("软件工程", "软件工程"));
        computerCollege.add(new Department("软件工程1", "软件工程1"));
        infoEngineerCollege.add(new Department("通信工程", "通信工程"));
        infoEngineerCollege.add(new Department("通信工程1", "通信工程1"));
        university.print();
    }
}
