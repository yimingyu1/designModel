package adapter.objadapter;

/**
 * ClassName: ObjVoltageAdapter
 * Description:
 * date: 2021/12/3 下午11:12
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class ObjVoltageAdapter implements Voltage5V{

    private Voltage220V voltage220V = new Voltage220V();

    @Override
    public int output5V() {
        return voltage220V.output220V() / 44;
    }
}
