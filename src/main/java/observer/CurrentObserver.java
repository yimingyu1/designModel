package observer;

/**
 * ClassName: CurrentObserver
 * Description:
 * date: 2021/12/11 下午4:22
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class CurrentObserver implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;

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
    public void update(float temperature, float pressure, float humidity) {
        setHumidity(humidity);
        setPressure(pressure);
        setTemperature(temperature);
        display();
    }

    public void display(){
        System.out.println(getTemperature() + " " + getPressure() + " " + getHumidity());
    }
}
