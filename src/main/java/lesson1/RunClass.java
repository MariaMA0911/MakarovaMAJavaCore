package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class RunClass {
       public static void main(String[] args) {
        Player[] player = new Player[4];
        player[0] = new Player("Ольга", 100, 100,50);
        player[1] = new Player("Геннадий", 200, 80,100);
        player[2] = new Player("Василий", 100, 100,30);
        player[3] = new Player("Светлана", 100, 120,50);

        Team team = new Team("Васильки", player);

        Course course = new Course(100, 100, 50);
        String result = course.doIt(team);
        System.out.println(result);


    }

}
