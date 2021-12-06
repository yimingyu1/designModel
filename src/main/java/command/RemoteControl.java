package command;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: RemoteControl
 * Description:
 * date: 2021/12/6 下午11:06
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command[] undoCommands;
    public RemoteControl(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        undoCommands = new Command[5];
        for(int i = 0; i < 5; i++){
            onCommands[i] = new NOCommand();
            offCommands[i] = new NOCommand();
            undoCommands[i] = new NOCommand();
        }
    }

    public void setCommand(int no , Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonPushed(int no){
        onCommands[no].execute();
        undoCommands[no] = onCommands[no];
    }

    public void offButtonPushed(int no){
        offCommands[no].execute();
        undoCommands[no] = offCommands[no];
    }

    public void undoButtonPushed(int no){
        undoCommands[no].undo();
    }
}
