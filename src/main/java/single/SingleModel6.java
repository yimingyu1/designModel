package single;

/**
 * ClassName: SingleModel6
 * Description:
 * date: 2021/11/27 下午1:41
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingleModel6 {

    private SingleModel6(){}

    static class SingleModel6Inner{
        private static final SingleModel6 SINGLE_MODEL_6 = new SingleModel6();
    }

    public static SingleModel6 getInstance(){
        return SingleModel6Inner.SINGLE_MODEL_6;
    }
}
