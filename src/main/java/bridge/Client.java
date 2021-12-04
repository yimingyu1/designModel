package bridge;

/**
 * @author yimingyu
 * @date 2021/12/04
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.call();
        phone.open();
        phone.close();
    }
}
