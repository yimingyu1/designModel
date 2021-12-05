package flyWeight;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/5 下午7:45
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite = webSiteFactory.getWebSite("新闻");
        webSite.use(new User("张三"));
        WebSite webSite1 = webSiteFactory.getWebSite("娱乐");
        webSite1.use(new User("李四"));
        WebSite webSite2 = webSiteFactory.getWebSite("娱乐");
        webSite1.use(new User("王五"));
        System.out.println(webSiteFactory.getWebSiteSize());
    }
}
