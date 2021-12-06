package command;

/**
 * ClassName: TVOnCommand
 * Description:
 * date: 2021/12/6 下午11:32
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class TVOnCommand implements Command{

    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.onTV();
    }

    @Override
    public void undo() {
        tvReceiver.offTV();
    }
}
