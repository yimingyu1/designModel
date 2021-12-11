package responsibilityChain;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/11 下午10:28
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {
    public static void main(String[] args) {
        Approver departmentApprover = new DepartmentApprover("部门");
        Approver collegeApprover = new CollegeApprover("徐晓");
        Approver MasterApprover = new MasterApprover("");
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(MasterApprover);
        MasterApprover.setApprover(departmentApprover);
        MasterApprover.process(100);
    }
}
