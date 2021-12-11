package responsibilityChain;

/**
 * ClassName: CollegeApprover
 * Description:
 * date: 2021/12/11 下午10:53
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class CollegeApprover extends Approver{

    public CollegeApprover(String name){
        super(name);
    }

    @Override
    public void process(int money) {
        if (3000 < money && money <= 10000){
            System.out.println("学校处理");
        } else {
            this.getApprover().process(money);
        }
    }
}
