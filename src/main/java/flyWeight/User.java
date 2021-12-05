package flyWeight;

/**
 * ClassName: User
 * Description:
 * date: 2021/12/5 下午7:53
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class User {
    private String name;
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
