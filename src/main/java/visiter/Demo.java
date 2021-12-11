package visiter;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/8 下午10:24
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {
    public static void main(String[] args) {
        Action action1 = new SuccessAction();
        Action action2 = new FailAction();
        Person man = new Man();
        Person woman = new Woman();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(man);
        objectStructure.attach(woman);
        objectStructure.display(action1);
        objectStructure.display(action2);

    }
}
