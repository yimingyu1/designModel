package prototype;

import java.io.Serializable;

/**
 * ClassName: DeepClone
 * Description:
 * date: 2021/11/27 下午9:29
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class DeepClone implements Serializable,Cloneable {

    private static final long serialVersionUID = 2225356421894413409L;

    private String cloneName;
    private String cloneClass;

    public DeepClone(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }
}
