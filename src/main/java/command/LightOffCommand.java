package command;

/**
 * ClassName: LightOffCommand
 * Description:
 * date: 2021/12/6 下午11:04
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class LightOffCommand implements Command{
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.offLight();
    }

    @Override
    public void undo() {
        lightReceiver.onLight();
    }
}
