package mediator;

import iterator.College;

/**
 * ClassName: Alarm
 * Description:
 * date: 2021/12/11 下午5:28
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name){
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void alarm(int stateChange){
        sendMessage(stateChange);
    }
}
