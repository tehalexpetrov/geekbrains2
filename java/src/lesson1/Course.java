package lesson1;

public enum Course {

            COURSE(10 , 5, 1), COURSE2(10, 2,1);

    protected int run;
    protected int swim;
    protected int jump;

    Course(int run, int swim, int jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public static void action(int run){
//        if(){
//
//        }

    }


    @Override
    public String toString() {
        return " --- Пробежали --> " + run + " Проплыли --> " + swim + " Прыгнули --> " + jump;
    }
}
