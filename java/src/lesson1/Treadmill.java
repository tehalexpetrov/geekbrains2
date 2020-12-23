package lesson1;

public class Treadmill {
    protected double mile;

    public Treadmill(double mile) {
        this.mile = mile;
    }

    public double getMile() { //Получаем ограничение на длину забега
        return mile;
    }

    @Override
    public String toString() {
        return "Пробежал " + mile;
    }
}
