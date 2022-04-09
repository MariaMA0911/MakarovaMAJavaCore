package lesson7.Primer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//аннотация, которая позволяет игнорировать неизвестные данные, которые не укладываются в заданную структуру
@JsonIgnoreProperties(ignoreUnknown = true)

public class Car {
    private String colour;

    @JsonProperty(value = "model")
    private String type;

    @JsonIgnore
    private  boolean isActive;

    public Car(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
