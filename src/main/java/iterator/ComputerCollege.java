package iterator;

import java.util.Iterator;

/**
 * ClassName: ComputerCollege
 * Description:
 * date: 2021/12/11 下午3:28
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class ComputerCollege implements College{

    private Department[] departments;
    private int index = 0;

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("java", "java");
        addDepartment("c", "c");
        addDepartment("php", "php");
    }


    @Override
    public void addDepartment(String name, String desc) {
        departments[index++] = new Department(name, desc);
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

    @Override
    public String getName() {
        return "计算机学院";
    }
}
