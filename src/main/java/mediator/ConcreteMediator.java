package mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: ConcreteMediator
 * Description:
 * date: 2021/12/11 下午5:43
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class ConcreteMediator extends Mediator{

    private Map<String, Colleague> colleagueMap;

    public ConcreteMediator(){
        colleagueMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
    }

    @Override
    public void getMessage(int state, String colleagueName) {
        switch (colleagueName){
            case ColleagueConstant.ALARM:
                if (state == 0){
                    ((TV)colleagueMap.get(ColleagueConstant.TV)).open();
                }
                break;
            case ColleagueConstant.TV:
                if (state == 1){
                    System.out.println("close tv");
                }
                break;
        }
    }
}
