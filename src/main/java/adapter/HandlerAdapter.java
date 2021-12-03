package adapter;


/**
 * ClassName: HandlerAdapter
 * Description:
 * date: 2021/12/3 下午11:42
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public interface HandlerAdapter {
    boolean supports(Object handler);
    void handle(Object handler);
}

class SimpleHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doHttpHandler();
    }
}

class HttpHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}
class AnnotationHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof  AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController)handler).doHttpHandler();
    }
}
