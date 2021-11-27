package single;

/**
 * ClassName: SingleModel2
 * Description: 懒汉式（线程不安全）
 * date: 2021/11/27 下午1:13
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingleModel2 {

    private static SingleModel2 singleModel2;

    private SingleModel2(){}

    public static SingleModel2 getInstance(){
        if (singleModel2 == null){
            singleModel2 = new SingleModel2();
        }
        return singleModel2;
    }
}
