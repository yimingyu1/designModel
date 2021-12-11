package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: WeatherData
 * Description:
 * date: 2021/12/11 下午4:26
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observerList;

    public WeatherData(){
        this.observerList = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void setData(float temperature, float pressure, float humidity){
        this.setTemperature(temperature);
        this.setPressure(pressure);
        this.setHumidity(humidity);
        this.notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: this.observerList
             ) {
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
