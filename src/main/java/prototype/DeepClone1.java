package prototype;

import java.io.*;

/**
 * ClassName: DeepClone1
 * Description:
 * date: 2021/11/27 下午9:34
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class DeepClone1 implements Serializable, Cloneable {
    private static final long serialVersionUID = -1141746149328004485L;

    private String name;
    private DeepClone deepClone;

    public DeepClone1(String name, DeepClone deepClone) {
        this.name = name;
        this.deepClone = deepClone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone1 deepClone1 = null;
        deepClone1 = (DeepClone1) super.clone();
        deepClone1.deepClone = (DeepClone)deepClone1.deepClone.clone();
        return deepClone1;
    }

    @Override
    public String toString() {
        return "DeepClone1{" +
                "name='" + name + '\'' +
                ", deepClone=" + deepClone +
                '}';
    }

    public DeepClone1 deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (DeepClone1) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
