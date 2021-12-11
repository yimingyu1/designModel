package observer;

/**
 * ClassName: Observer
 * Description:
 * date: 2021/12/11 下午4:20
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);

}
