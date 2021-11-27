package single;

/**
 * ClassName: SingleModel3
 * Description: 懒汉式（线程安全），使用同步方法
 * date: 2021/11/27 下午1:20
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingleModel3 {

    private static  SingleModel3 singleModel3;

    private SingleModel3(){}

    public static synchronized SingleModel3 getInstance(){
        if (singleModel3 == null){
            singleModel3 = new SingleModel3();
        }
        return singleModel3;
    }
}
