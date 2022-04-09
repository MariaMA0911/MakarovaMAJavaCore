package lesson7.Primer;

import java.util.ArrayList;
import java.util.List;

public class Example {

    //здесь создаем лист объектов, класс которых (структура) прописаны в ExampleObject, делаем констурктор, геттеры и сеттеры
        List<ExampleObject> exampleObjects = new ArrayList<>();

    public Example(List<ExampleObject> exampleObjects) {
        this.exampleObjects = exampleObjects;
    }

    public List<ExampleObject> getExampleObjects() {
        return exampleObjects;
    }

    public void setExampleObjects(List<ExampleObject> exampleObjects) {
        this.exampleObjects = exampleObjects;
    }
}
