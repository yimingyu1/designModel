package command;

/**
 * ClassName: LightOnCommand
 * Description:
 * date: 2021/12/6 下午11:00
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class LightOnCommand implements Command{

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.onLight();
    }

    @Override
    public void undo() {
        lightReceiver.offLight();
    }
}
