package command;

/**
 * ClassName: TVOffCommand
 * Description:
 * date: 2021/12/6 下午11:34
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class TVOffCommand implements Command{

    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.offTV();
    }

    @Override
    public void undo() {
        tvReceiver.onTV();
    }
}
