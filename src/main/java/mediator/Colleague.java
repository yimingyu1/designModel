package mediator;

import iterator.College;

/**
 * ClassName: Colleague
 * Description:
 * date: 2021/12/11 下午5:21
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator(){
        return this.mediator;
    }

    public String getName(){
        return this.name;
    }

    public abstract void sendMessage(int stateChange);
}
