package bridge;

/**
 * @author yimingyu
 * @date 2021/12/04
 */
public class Vivo implements Brand{
    @Override
    public void call() {
        System.out.println("vivo打电话");
    }

    @Override
    public void open() {
        System.out.println("vivo开机");
    }

    @Override
    public void close() {
        System.out.println("vivo关机");
    }
}
