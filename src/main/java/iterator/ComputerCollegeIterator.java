package iterator;

import java.util.Iterator;

/**
 * ClassName: ComputerCollegeIterator
 * Description:
 * date: 2021/12/11 下午3:20
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int index =0;

    public ComputerCollegeIterator(Department[] departments){
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[index];
        index++;
        return department;
    }
}
