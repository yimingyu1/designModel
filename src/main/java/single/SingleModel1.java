package single;

/**
 * ClassName: SingleModel1
 * Description:  饿汉模式（静态常量）
 * date: 2021/11/27 下午12:59
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingleModel1 {

    private SingleModel1(){}

    private static  SingleModel1 singleModel1;

    static {
        singleModel1 = new SingleModel1();
    }

    public static SingleModel1 getInstance(){
        return singleModel1;
    }
}
