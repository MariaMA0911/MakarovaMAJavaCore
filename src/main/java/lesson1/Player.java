package lesson1;

public class Player {
    private String name;
    private int run;
    private int swim;
    private int jump;


    public Player(String name, int run, int swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public int getJump() {
        return jump;
    }
}
