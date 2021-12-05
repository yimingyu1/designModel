package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: College
 * Description:
 * date: 2021/12/5 上午10:33
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class College extends Organization{

    private List<Organization> organizations = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    public void add(Organization organization){
        organizations.add(organization);
    }

    public void remove(Organization organization){
        if (organizations.contains(organization)){
            organizations.remove(organization);
        }
    }

    @Override
    public void print() {
        System.out.println("---------------" + getName() + "----------------");
        for (Organization o: organizations
        ) {
            o.print();
        }
    }
}
