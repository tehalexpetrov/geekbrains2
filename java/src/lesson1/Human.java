package lesson1;

public class Human implements Limitations {
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

    public String getName(){
        return name;
    }

    public int getRun(){
        return run;
    }

    public int getJump(){
        return jump;
    }

    void doRunHuman(){
        if (getRun() >= TREADMILL){
            System.out.println("Молодец. Ты хорошо бегаешь.");
        } else if(getRun() == 0){
            System.out.println(" Выбывает ");
        } else {
            System.out.println("Ты ленивый! Поднажми");
        }
    }

    void doJumpHuman(){
        if (getJump() >= WALL){
            System.out.println("Молодец. Ты хорошо прыгаешь.");
        } else if(getJump() == 0){
            System.out.println(" Выбывает ");
        } else {
            System.out.println("Ты ленивый! Тренируйся больше");
        }
    }
}
