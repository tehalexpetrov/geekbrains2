package lesson1;

public class Robot  implements Limitations {

    protected String name;
    protected int run;
    protected int jump;

    public Robot(String name, int run, int jump) {
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

    @Override
    public String toString() {
        return "Робот --> " + name + " Пробежал " + run + " метров " + " Прыгнул на " + jump + " метров(a)";
    }

    void doRunRobot(){
        if (getRun() >= TREADMILL){
            System.out.println("Молодец. Ты хорошо бегаешь.");
        } else if(getRun() == 0){
            System.out.println(" Выбывает ");
        } else {
            System.out.println("Ты ленивый! Поднажми");
        }
    }

    void doJumpRobot(){
        if (getJump() >= WALL){
            System.out.println("Молодец. Ты хорошо прыгаешь.");
        } else if(getJump() == 0){
            System.out.println(" Выбывает ");
        } else {
            System.out.println("Ты ленивый! Тренируйся больше");
        }
    }
}
