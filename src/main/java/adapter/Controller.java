package adapter;

/**
 * ClassName: Controller
 * Description:
 * date: 2021/12/3 下午11:38
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public interface Controller {
}

class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("http....");
    }
}
class SimpleController implements Controller{
    public void doHttpHandler(){
        System.out.println("simple....");
    }
}
class AnnotationController implements Controller{
    public void doHttpHandler(){
        System.out.println("annotation....");
    }
}
