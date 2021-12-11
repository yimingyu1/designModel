package visiter;

/**
 * ClassName: SuccessAction
 * Description:
 * date: 2021/12/8 下午10:51
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SuccessAction extends Action{

    @Override
    public void getVoteResult(Person person) {
        if (person instanceof Man){
            System.out.println("man success");
        } else if (person instanceof Woman){
            System.out.println("woman success");
        }
    }
}
