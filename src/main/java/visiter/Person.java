package visiter;

/**
 * ClassName: Person
 * Description:
 * date: 2021/12/8 下午10:50
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Person {

    public abstract void accept(Action action);
}
