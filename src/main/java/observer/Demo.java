package observer;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/12/11 下午4:08
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new CurrentObserver());
        weatherData.setData(12, 11, 10);

    }
}
