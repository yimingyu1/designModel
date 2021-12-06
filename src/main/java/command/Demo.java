package command;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/6 下午11:24
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.undoButtonPushed(0);

        TVReceiver tvReceiver = new TVReceiver();
        Command tvOnCommand = new TVOnCommand(tvReceiver);
        Command tvOffCommand = new TVOffCommand(tvReceiver);
        remoteControl.setCommand(1, tvOnCommand, tvOffCommand);
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
        remoteControl.undoButtonPushed(1);
    }
}
