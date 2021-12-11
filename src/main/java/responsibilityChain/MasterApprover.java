package responsibilityChain;

/**
 * ClassName: MasterApprover
 * Description:
 * date: 2021/12/11 下午10:57
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class MasterApprover extends Approver{

    public MasterApprover(String name){
        super(name);
    }

    @Override
    public void process(int money) {
        if (money > 10000){
            System.out.println("校长亲批");
        } else {
            this.getApprover().process(money);
        }
    }
}
