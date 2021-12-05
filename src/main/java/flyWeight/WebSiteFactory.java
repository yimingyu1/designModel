package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: WebSiteFactory
 * Description:
 * date: 2021/12/5 下午7:51
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class WebSiteFactory {

    private Map<String, ConcreteWebSite> concreteWebSiteMap = new HashMap<>();

    public WebSite getWebSite(String type){
        if (!concreteWebSiteMap.containsKey(type)){
            concreteWebSiteMap.put(type, new WebSite(type));
        }
        return (WebSite)concreteWebSiteMap.get(type);
    }

    public int getWebSiteSize(){
        return concreteWebSiteMap.size();
    }
}
