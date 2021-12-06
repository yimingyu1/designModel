package command;

/**
 * ClassName: Command
 * Description:
 * date: 2021/12/6 下午10:47
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public interface Command {

    void execute();
    void undo();
}
