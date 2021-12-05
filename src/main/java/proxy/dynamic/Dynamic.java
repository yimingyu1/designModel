package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: Dynamic
 * Description:
 * date: 2021/12/5 下午8:54
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Dynamic {
    private Object teacher;

    public Dynamic(Object teacher){
        this.teacher = teacher;
    }

    public Object getTeacher(){
        return Proxy.newProxyInstance(teacher.getClass().getClassLoader(), teacher.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("start proxy ...");
                Object invoke = method.invoke(teacher, args);
                System.out.println("end proxy ...");
                return invoke;
            }
        });
    }
}
