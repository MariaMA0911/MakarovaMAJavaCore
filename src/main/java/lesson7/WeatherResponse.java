package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import okhttp3.ResponseBody;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    //3. Реализовать вывод погоды на следующие 5 дней в формате
    //| В городе CITY на дату DATE ожидается WEATHER_TEXT, температура - TEMPERATURE
    private String LocalObservationDateTime;//дата
    private String WeatherText;//текст
    Temperature TemperatureObject;

    public WeatherResponse(String localObservationDateTime, String weatherText, Temperature temperatureObject) {
        LocalObservationDateTime = localObservationDateTime;
        WeatherText = weatherText;
        TemperatureObject = temperatureObject;
    }


// Getter Methods

    public String getLocalObservationDateTime() {
        return LocalObservationDateTime;
    }

    public String getWeatherText() {
        return WeatherText;
    }


    public Temperature getTemperature() {
        return TemperatureObject;
    }


    // Setter Methods

    public void setLocalObservationDateTime(String LocalObservationDateTime) {
        this.LocalObservationDateTime = LocalObservationDateTime;
    }


    public void setWeatherText(String WeatherText) {
        this.WeatherText = WeatherText;
    }

    public void setTemperature(Temperature TemperatureObject) {
        this.TemperatureObject = TemperatureObject;
    }

}

@JsonIgnoreProperties(ignoreUnknown = true)
class Temperature {
    Metric MetricObject;
    // Getter Methods

    public Metric getMetric() {
        return MetricObject;
    }


    // Setter Methods

    public void setMetric(Metric MetricObject) {
        this.MetricObject = MetricObject;
    }


}

@JsonIgnoreProperties(ignoreUnknown = true)
class Metric {
    private float Value;
    private String Unit;
    private float UnitType;


    // Getter Methods

    public float getValue() {
        return Value;
    }

    public String getUnit() {
        return Unit;
    }

    public float getUnitType() {
        return UnitType;
    }

    // Setter Methods

    public void setValue(float Value) {
        this.Value = Value;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public void setUnitType(float UnitType) {
        this.UnitType = UnitType;
    }
}

