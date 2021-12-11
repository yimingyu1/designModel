package responsibilityChain;

/**
 * ClassName: DepartmentApprover
 * Description:
 * date: 2021/12/11 下午10:51
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class DepartmentApprover extends Approver{

    public DepartmentApprover(String name){
        super(name);
    }

    @Override
    public void process(int money) {
        if (money <=3000){
            System.out.println("部门处理");
        } else {
            this.getApprover().process(money);
        }
    }
}
