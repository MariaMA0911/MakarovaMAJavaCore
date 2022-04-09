package lesson4;

import java.util.*;

public class Task1 {
    //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать, сколько раз встречается каждое слово.
    public static void main(String[] args) {

    List<String> words = Arrays.asList("один", "два", "котик", "три", "котик", "котик","четыре", "котик", "пять", "ромашка", "ромашка");

    HashSet<String> unique = new HashSet<String>(words);

   // System.out.println("Уникальные значения: " + unique.toString());

     for (String key : unique) {
        System.out.println(key + " повторяется " + Collections.frequency(words, key) + " раз(а)");
    }
}//конец main
}//конец класса
