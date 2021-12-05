package proxy.cglib;

import factory.PizzaCase.pizza002.AbsFactory;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ClassName: ProxyFactory
 * Description:
 * date: 2021/12/5 下午9:40
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class ProxyFactory implements MethodInterceptor {

    private Object teacher;

    public ProxyFactory(Object teacher){
        this.teacher = teacher;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(teacher.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("start cglib ...");
        Object invoke = method.invoke(teacher, objects);
        System.out.println("end cglib ...");
        return invoke;
    }
}
