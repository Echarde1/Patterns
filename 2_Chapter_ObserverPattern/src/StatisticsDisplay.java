import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum= 0.0f;
  private int numReadings;
  Observable observable;

  public StatisticsDisplay(Observable o) {
    observable = o;
    o.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      this.numReadings++;
      if (weatherData.getTemperature() > maxTemp) {
        maxTemp = weatherData.getTemperature();
      }

      if (weatherData.getTemperature() < minTemp) {
        minTemp = weatherData.getTemperature();
      }

      display();
    }
  }

  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
        + "/" + maxTemp + "/" + minTemp);
  }
}
