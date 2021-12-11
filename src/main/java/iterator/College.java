package iterator;

import java.util.Iterator;

/**
 * ClassName: College
 * Description:
 * date: 2021/12/11 下午3:27
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public interface College {

    void addDepartment(String name, String desc);

    Iterator createIterator();

    String getName();

}
