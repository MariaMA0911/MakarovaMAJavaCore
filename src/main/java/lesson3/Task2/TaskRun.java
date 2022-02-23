package lesson3.Task2;

import java.sql.SQLOutput;

public class TaskRun<apple0> {
    public static void main(String[] args) {

        Apple[] apples = new Apple[10];
        Apple apple0 = new Apple(1.0f);
        //Apple apple1 = new Apple(1.0f);
        //Apple apple2 = new Apple(1.0f);

        apples[0] = apple0;
        apples[1] = apple0;
        apples[2] = apple0;
        apples[3] = apple0;

        Box<Apple> box1 = new Box<>(apples);

        Apple[] apples1 = new Apple[10];
        apples1[0] = apple0;
        apples1[1] = apple0;
        apples1[2] = apple0;
        apples1[3] = apple0;

        Box<Apple> box2 = new Box<>(apples1);

        System.out.println("Вес коробки " + box1.getWeightSum());
        System.out.println("Результат сравнения коробок с одним видом фруктов: " + box1.compare(box2));
        box1.toEmptyArray(box2);
        System.out.println("Вес коробки с пересыпанными фруктами " + box1.getWeightSum());

        Orange[] oranges = new Orange[10];
        Orange orange0 = new Orange(1.5f);
        oranges[0] = orange0;
        oranges[1] = orange0;

        Box<Orange> box3 = new Box<>(oranges);

        System.out.println("Результат сравнения коробок с разными видами фруктов: " + box1.compare(box3));
    }
}
