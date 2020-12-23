package lesson1;

public class Robot {

    protected String name;
    protected int run;
    protected int jump;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "Робот --> " + name + " Пробежал " + run + " метров " + " Прыгнул на " + jump + " метров(a)";
    }
}
