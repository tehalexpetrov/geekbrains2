package lesson1;

public class Cat implements Limitations {

    protected String name;
    protected int run;
    protected int jump;

    public Cat (String name, int run, int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void run() {
        System.out.println(this.name + " пробежал --> " + this.doRun());
    }

    @Override
    public void jump() {
        System.out.println(this.name + " прыгнул --> " + this.doJump());
    }

    @Override
    public int doRun() {
        return run;
    }

    @Override
    public int doJump() {
        return jump;
    }

    @Override
    public String toString() {
        return  name + " Пробежал " + run + " метров " + " Прыгнул на " + jump + " метров(a)";
    }
}
