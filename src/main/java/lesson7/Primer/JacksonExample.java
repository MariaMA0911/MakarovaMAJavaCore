package lesson7.Primer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class JacksonExample {
    public static void main(String[] args) throws JsonProcessingException {
        //создаем объект  mapper, с помощью которого будет проводить сериализацию и десериализацию
        ObjectMapper mapper = new ObjectMapper();
        List<ExampleObject> exampleObjects = new ArrayList<>();
        ExampleObject exampleObject1 = new ExampleObject("раз", "разраз", 15, true);
        ExampleObject exampleObject2 = new ExampleObject("два", "двадва", 16, false);
        ExampleObject exampleObject3 = new ExampleObject("три", "тритри", 17, true);

        exampleObjects.add(exampleObject1);
        exampleObjects.add(exampleObject2);
        exampleObjects.add(exampleObject3);

        Example example = new Example(exampleObjects);

        String json = mapper.writeValueAsString(example);
        System.out.println(json);

    }
}
