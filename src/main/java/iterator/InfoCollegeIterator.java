package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * ClassName: InfoCollegeIterator
 * Description:
 * date: 2021/12/11 下午3:23
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class InfoCollegeIterator implements Iterator {

    private List<Department> departmentList;
    private int index = -1;

    public InfoCollegeIterator(List<Department> departmentList){
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1){
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
