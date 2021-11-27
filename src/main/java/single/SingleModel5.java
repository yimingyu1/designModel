package single;

/**
 * ClassName: SingleModel5
 * Description:
 * date: 2021/11/27 下午1:30
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingleModel5 {

    private static volatile SingleModel5 singleModel5;
    private SingleModel5(){};

    public static SingleModel5 getInstance(){
        if (singleModel5 == null){
            synchronized (SingleModel5.class){
                if (singleModel5 == null){
                    singleModel5 = new SingleModel5();
                }
            }
        }
        return singleModel5;
    }
}
