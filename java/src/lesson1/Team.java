package lesson1;

import java.util.Random;

public enum Team {
    BIRDS("Андрей","Максим", "Вячеслав", "Константин"), LION("Александр", "Олег", "Анатолий", "Павел");

    private static Random random;
    private String name;
    private int run;
    private int swim;
    private int jump;

    /* Создаем поля класса */
     Team(String name1, String name2, String name3, String name4) {
        this.name = name;
        this.run = run;
    }

    protected String getName(){ //Возращаем имя члена команды
        return name;
    }

    private int getRun(){ //Дистанция пройденная членом команды
        Random random = new Random(10);
        return run;
    }

    private int getSwim(){ //Дистанция пройденная членом команды
        Random random = new Random(5);
        return swim;
    }

    private int getJump(){ //Дистанция пройденная членом команды
        Random random = new Random(3);
        return jump;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }
}
