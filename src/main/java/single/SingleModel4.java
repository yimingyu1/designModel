package single;

/**
 * ClassName: SingleModel4
 * Description:
 * date: 2021/11/27 下午1:25
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingleModel4 {

    private static SingleModel4 singleModel4;
    private SingleModel4(){}

    public static SingleModel4 getInstance(){
        if (singleModel4 == null){
            synchronized (SingleModel4.class){
                singleModel4 = new SingleModel4();
            }
        }
        return singleModel4;
    }
}
