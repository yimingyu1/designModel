package facade;

/**
 * ClassName: DVD
 * Description:
 * date: 2021/12/5 下午7:02
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class DVD {

    private static final DVD DVD = new DVD();
    private DVD(){};
    public static DVD getInstance(){
        return DVD;
    }
    public void open(){
        System.out.println("open dvd");
    }
    public void close(){
        System.out.println("close dvd");
    }
}
