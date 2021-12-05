package composite;

import com.sun.xml.internal.ws.server.UnsupportedMediaException;

/**
 * ClassName: Organization
 * Description:
 * date: 2021/12/5 上午10:28
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Organization {
    private String name;
    private String desc;

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void add(Organization organization){
        throw new UnsupportedMediaException();
    }
    public void remove(Organization organization){
        throw new UnsupportedMediaException();
    }
    public abstract void print();
}
