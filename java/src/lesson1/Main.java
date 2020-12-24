package lesson1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Random rand = new Random();

        int run = random.nextInt(10);
        int run2 = rand.nextInt(10);
        int jump = random.nextInt(3);
        int jump2 = rand.nextInt(3);

        Cat[] cats = {new Cat("Барсик", run, jump), new Cat("Снежок", run2, jump2)};

        for (Cat cat : cats) {
            cat.catPrintInfo();
            System.out.println(cat.getName() + " --> " + cat.getRun());
            if (cat.getRun() > cat.doActionCat()) {
                System.out.println("Молодцы! Справились");
            }
        }


        Human[] human = {new Human("Антон", 6, 1), new Human("Жора", 1, 1)};
        Robot[] robot1 = {new Robot("Робокоп", 10, 4), new Robot("Бабелби", 4, 8)};


        Wall wall = new Wall(3);
        Treadmill tread = new Treadmill(3);

    }
}
