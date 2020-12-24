package lesson1;

public class Cat {

    protected String name;
    protected int run;
    protected int jump;

    public Cat (String name, int run, int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName(){
        return name;
    }

    public int getRun(){
        return run;
    }

    public int getJump(){
        return jump;
    }

    void catPrintInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  name + " Пробежал " + run + " метров " + " Прыгнул на " + jump + " метров(a)";
    }

    public int catAction(){
        return getHeight();
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
