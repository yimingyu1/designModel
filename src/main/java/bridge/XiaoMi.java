package bridge;

/**
 * @author yimingyu
 * @date 2021/12/04
 */
public class XiaoMi implements Brand{
    @Override
    public void call() {
        System.out.println("xiaomi打电话");
    }

    @Override
    public void open() {
        System.out.println("xiomi开机");
    }

    @Override
    public void close() {
        System.out.println("xiaomi关机");
    }
}
