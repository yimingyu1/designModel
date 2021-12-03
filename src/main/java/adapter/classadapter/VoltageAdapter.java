package adapter.classadapter;

/**
 * ClassName: VoltageAdapter
 * Description:
 * date: 2021/12/3 下午11:00
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        return output220V() / 44;
    }
}
