package iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/11 下午1:41
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {

    private List<College> collegeList = new ArrayList<>();

    public void addCollege(College college){
        collegeList.add(college);
    }

    public List<College> getCollegeList() {
        return collegeList;
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.addCollege(new ComputerCollege());
        demo.addCollege(new InfoCollege());
        Iterator<College> iterator = demo.getCollegeList().iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println(college.getName());
            demo.printDepartment(college.createIterator());
        }
    }
}
