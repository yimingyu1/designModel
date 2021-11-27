package prototype;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/11/27 下午5:16
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 克隆该实例，使用默认的clone方法来实现
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone(){
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
