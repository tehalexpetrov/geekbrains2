package lesson1;

public class Course {
    protected int run;
    protected int swim;
    protected int jump;

    Course(int run, int swim, int jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public Course(Course course1, Course course2) {

    }

    public int actionRun(){
        return run;
    }

    public int actionSwim(){
        return swim;
    }

    public int actionJump(){
        return jump;
    }

    public void printAction(){
        System.out.println(this);
    }


    @Override
    public String toString() {
        return " --- Пробежали --> " + run + " Проплыли --> " + swim + " Прыгнули --> " + jump;
    }
}
