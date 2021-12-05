package facade;

/**
 * ClassName: Facade
 * Description:
 * date: 2021/12/5 下午7:06
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Facade {

    private DVD dvd;
    private PopCron popCron;

    public Facade(){
        dvd = DVD.getInstance();
        popCron = PopCron.getInstance();
    }

    public void open(){
        dvd.open();
        popCron.open();
    }
    public void close(){
        dvd.close();
        popCron.close();
    }
}
