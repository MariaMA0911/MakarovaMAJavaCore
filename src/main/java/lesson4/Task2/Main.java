package lesson4.Task2;


public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("1111", "Ivanov");
        phonebook.add("1112", "Ivanov");
        phonebook.add("1113", "Petrov");
        phonebook.add("1114", "Ivanova");
        phonebook.add("1115", "Petrova");
        phonebook.add("1116", "Egorov");

        System.out.println(phonebook.get("Ivanov"));

    }
}


