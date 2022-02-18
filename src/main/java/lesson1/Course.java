package lesson1;

public class Course {

    String result;
    private int runLenght;
    private int swimLenght;
    private int jumpNumbers;

    public Course(int runLenght, int swimLenght, int jumpNumbers) {
        this.runLenght = runLenght;
        this.swimLenght = swimLenght;
        this.jumpNumbers = jumpNumbers;
    }

    public String doIt (Team team) {
        result = "Игрок: " + team.getName() + " " + '\n';
        for (Player player : team.getPlayers()) {
            result = "Игрок: " + player.getName() + " " + '\n';
            int valueRun = player.getRun();
            int valueSwim = player.getSwim();
            int valueJump = player.getJump();
            testRun(valueRun);
            testSwim(valueSwim);
            testJump(valueJump);
        }
        return result;
    }


    private void testJump(int valueJump) {
        if (valueJump >= jumpNumbers) result += "дистанцию по прыжкам прошёл" + '\n';
    }

    private void testSwim(int valueSwim) {
        if (valueSwim >= swimLenght) result += "дистанцию по плаванию прошёл" + '\n';
    }

    private void testRun(int valueRun) {
        if (valueRun >= runLenght) result += "дистанцию по бегу прошёл" + '\n';
    }
}
