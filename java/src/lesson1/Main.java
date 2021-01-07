package lesson1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random catRun = new Random();
        Random catJump = new Random();
        Random humRun = new Random();
        Random humJump = new Random();
        Random robRun = new Random();
        Random robJump = new Random();

        int catR = catRun.nextInt(10);
        int catJ = catJump.nextInt(5);
        int humR = humRun.nextInt(10);
        int humJ = humJump.nextInt(5);
        int robR = robRun.nextInt(10);
        int robJ = robJump.nextInt(5);

        Limitations[] part = {new Cat("Барсик", catR, catJ), new Human("Антон", humR, humJ), new Robot("Робокоп", robR, robJ)};

        Barrier[] bar = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < bar.length; i++) {
            Random ranTreid = new Random();
            int rT = ranTreid.nextInt(10);
            isRoad = ranTreid.nextBoolean();
            if (isRoad) {
                bar[i] = new Treadmill("Road " + i, rT);
            } else {
                bar[i] = new Wall("Wall " + i, rT);
            }
        }

        for (int i = 0; i < part.length; i++) {
            boolean result = true;
            for (int j = 0; j < bar.length; j++) {
                result = bar[j].isAction(part[i]);
                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println(" Успешно!");
            } else {
                System.out.println("Плохо!");
            }
        }
    }
}
