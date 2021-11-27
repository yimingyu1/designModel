package prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: SheepTest
 * Description:
 * date: 2021/11/27 下午5:35
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SheepTest {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("哆莉", 11, "writer");
        System.out.println(sheep);
        System.out.println(sheep.hashCode());
        Sheep sheep1 = (Sheep)sheep.clone();
        System.out.println(sheep1);
        System.out.println(sheep1.hashCode());
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Sheep sheep2 = ctx.getBean("sheep", Sheep.class);

        System.out.println(sheep2);
    }
}
