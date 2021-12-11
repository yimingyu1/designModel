package observer;

import java.util.List;

/**
 * ClassName: Sbuject
 * Description:
 * date: 2021/12/11 下午4:24
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
