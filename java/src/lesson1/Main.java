package lesson1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random kote = new Random();
        Random kote2 = new Random();

        int run = kote.nextInt(10);
        int run2 = kote2.nextInt(10);
        int jump = kote.nextInt(3);
        int jump2 = kote2.nextInt(3);

        System.out.println("\nПолосу препядствий проходят Коты\n");

        Cat[] cats = {new Cat("Барсик", run, jump), new Cat("Снежок", run2, jump2)};

        for (Cat cat : cats) {
            /* Котики бегают */
            System.out.print(cat.getName() + " --> " + cat.getRun() + " км --> ");
            cat.doRunCat();

            /* Котики Прыгают */
            System.out.print(cat.getName() + " --> " + cat.getJump() + " м --> ");
            cat.doJumpCat();
        }

        System.out.println("\nПолосу препядствий проходят Люди\n");

        Human[] humans = {new Human("Антон", 6, 1), new Human("Жора", 1, 1)};
        for (Human human : humans) {
            /* Люди бегут дистанцию */
            System.out.print(human.getName() + " --> " + human.getRun() + " км --> ");
            human.doRunHuman();

            /* Люди Прыгают */
            System.out.print(human.getName() + " --> " + human.getJump() + " м --> ");
            human.doJumpHuman();
        }

        System.out.println("\nПолосу препядствий проходят Роботы\n");

        Robot[] robots = {new Robot("Робокоп", 10, 4), new Robot("Бамблби", 4, 8)};

        for (Robot robot : robots) {
            /* Роботы бегут дистанцию */
            System.out.print(robot.getName() + " --> " + robot.getRun() + " км --> ");
            robot.doRunRobot();

            /* Роботы Прыгают */
            System.out.print(robot.getName() + " --> " + robot.getJump() + " м --> ");
            robot.doJumpRobot();
        }

    }
}
