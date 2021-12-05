package facade;

/**
 * ClassName: PopCron
 * Description:
 * date: 2021/12/5 下午7:04
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class PopCron {

    private static PopCron popCron;
    private PopCron(){}
    public static PopCron getInstance(){
        if (popCron == null){
            synchronized (PopCron.class){
                if (popCron == null){
                    popCron = new PopCron();
                }
            }
        }
        return popCron;
    }

    public void open(){
        System.out.println("popCron open");
    }

    public void close(){
        System.out.println("popCron close");
    }
}
