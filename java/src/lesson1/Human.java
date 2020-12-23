package lesson1;

public class Human {
    protected String name;
    protected int run;
    protected int jump;

    public Human(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "Человек --> " + name + " Пробежал " + run + " метров " + " Прыгнул на " + jump + " метров(a)";
    }
}
