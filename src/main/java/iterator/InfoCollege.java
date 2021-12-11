package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: InfoCollege
 * Description:
 * date: 2021/12/11 下午3:34
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class InfoCollege implements College{

    private List<Department> departmentList;

    public InfoCollege(){
        departmentList = new ArrayList<>();
        addDepartment("java-1", "java-1");
        addDepartment("c-1", "c-1");
        addDepartment("php-1", "php-1");
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }
}
