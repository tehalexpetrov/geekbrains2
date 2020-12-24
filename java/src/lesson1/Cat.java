package lesson1;

public class Cat implements Limitations {

    protected String name;
    protected int run;
    protected int jump;
    private boolean action;

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

    @Override
    public String toString() {
        return  name + " Пробежал " + run + " метров " + " Прыгнул на " + jump + " метров(a)";
    }

    void doRunCat(){
        if (getRun() >= TREADMILL){
            System.out.println("Молодец. Ты хорошо бегаешь.");
        } else if(getRun() == 0){
            System.out.println(" Выбывает ");
        } else {
            System.out.println("Ты ленивый! Поднажми");
        }
    }

    void doJumpCat(){
        if (getJump() >= WALL){
            System.out.println("Молодец. Ты хорошо прыгаешь.");
        } else if(getJump() == 0){
            System.out.println(" Выбывает ");
        } else {
            System.out.println("Ты ленивый! Тренируйся больше");
        }
    }
}
