package flyWeight;

/**
 * ClassName: WebSite
 * Description:
 * date: 2021/12/5 下午7:50
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class WebSite extends ConcreteWebSite{

    private String type;

    public WebSite(String type){
        this.type = type;
    }

    public void use(User user){
        System.out.println(type + " site, " + "user: " + user.getName());
    }
}
