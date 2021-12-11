package visiter;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ObjectStructure
 * Description:
 * date: 2021/12/8 下午10:55
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    public void attach(Person person){
        personList.add(person);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        personList.forEach(person -> {person.accept(action);});
    }
}
