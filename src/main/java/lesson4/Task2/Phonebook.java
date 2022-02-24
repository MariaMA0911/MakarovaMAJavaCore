package lesson4.Task2;

import java.util.HashMap;

public class Phonebook {
    //2. Написать простой класс «Телефонный Справочник»,
    // который хранит в себе список фамилий и телефонных номеров.
    // В этот телефонный справочник с помощью метода add() можно добавлять записи,
    // а с помощью метода get() искать номер телефона по фамилии.
    // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    // тогда при запросе такой фамилии должны выводиться все телефоны.
    private HashMap<String, String> phonebook = new HashMap<>();

    public void add(String phone, String fio) {
        phonebook.put(phone, fio);
    }

    public String get (String fio) {
        if (phonebook.containsValue(fio)) {
            String result = "Номер: ";
            for (String key : phonebook.keySet()) {
                if (phonebook.get(key).equals(fio)) result += key + "; ";
            }
            return result;
        } else return "Не найдено";

    }

}

