package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DispatchServlet
 * Description:
 * date: 2021/12/3 下午11:40
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class DispatchServlet {

    private List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet(){
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public HandlerAdapter getHandler(Controller controller){
        for (HandlerAdapter ha: handlerAdapters
             ) {
            if (ha.supports(controller)){
                return ha;
            }
        }
        return null;
    }

    public void doDispatch(){
        AnnotationController annotationController = new AnnotationController();
        HandlerAdapter handlerAdapter = getHandler(annotationController);
        handlerAdapter.handle(annotationController);
    }

}
