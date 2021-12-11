package responsibilityChain;

/**
 * ClassName: Approver
 * Description:
 * date: 2021/12/11 下午10:47
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Approver {
    private Approver approver;
    private String name;

    public Approver(String name){
        this.name = name;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void process(int money);
}
