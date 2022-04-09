package lesson7.Primer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student("d;jfhgal", 15);
        //проводим сериализацию объекта student в jsonStudent
        String jsonStudent = objectMapper.writeValueAsString(student);
        System.out.println(jsonStudent);

        navigatingByJsonAsNodeTree();
    }

    private static void writeJsonToFile() throws IOException {
        //проводим сериализацию объекта в файл
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("dfa", "fdsdg");
        //objectMapper.writeValue(new File("car.json"), car);
           }

           private static void readJsonFromString () throws JsonProcessingException {
        //пример чтения json из стринги
               //задаем json
               String jsonString ="{\"color\":\"white\", \"type\":\"volga\"}";
               ObjectMapper objectMapper = new ObjectMapper();
               //передаем  jsonString, который мы десериализуем, в объект car
               Car car = objectMapper.readValue(jsonString, Car.class);
               System.out.println(car);
           }

    private static void readObjectWithUnknownProperties () throws JsonProcessingException {
        //пример чтения json из стринги c неизвествными пропертями
        //задаем json
        String jsonString ="{\"color\":\"white\", \"type\":\"volga\", \"year\":\"1999\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        //передаем  jsonString, который мы десериализуем, в объект car
        Car car = objectMapper.readValue(jsonString, Car.class);
        System.out.println(car);
        //получим только то, что есть в объекте car.
        // Для этого в класс car  нужно добавить аннотацию @JsonIgnoreProperties(ignoreUnknown = true)
    }

    private static void readValuesToList() throws JsonProcessingException {
        //у нас два объекта в виде листа объектов
        String carsList = "[{\"color\":\"red\", \"type\":\"BMW\"}," +
                " {\"color\":\"black\", \"type\":\"lada priora\"}]";
        ObjectMapper objectMapper = new ObjectMapper();
        //сериализация будет происходить не в java объект, а в лист
        List<Car> carList = objectMapper.readValue(carsList, new TypeReference<List<Car>>() {});
        System.out.println(carsList);
    }

    private static void navigatingByJsonAsNodeTree() throws JsonProcessingException {
        //получаем только часть информации из строки json
        String jsonString = "{\"name\":\"Ivan\", \"education\": "+
                "{\"school\": \"School #52\", \"university\": " +
                "{\"degree\": \"master\", \"name\": null}}}";
        System.out.println(jsonString);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode universityName = objectMapper.readTree(jsonString).at("/education/university/name");
        System.out.println("пример, где получаем часть информации " + universityName.asText());
    }
}
