package mediator;

/**
 * ClassName: TV
 * Description:
 * date: 2021/12/11 下午5:33
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class TV extends Colleague{

    public TV(Mediator mediator, String name){
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void close(int stateChange){
        sendMessage(stateChange);
    }

    public void open(){
        System.out.println("开TV");
    }
}
