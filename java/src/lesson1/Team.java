package lesson1;

public enum Team {
    BIRDS("Birds","Андрей","Максим", "Вячеслав", "Константин"), LION("Lion","Александр", "Олег", "Анатолий", "Павел");

    protected String teamName;
    private String name;
    private final String name2;
    private final String name3;
    private final String name4;
    private int run;
    private int swim;
    private int jump;

    /* Создаем поля класса */
     Team(String teamName, String name, String name2, String name3, String name4) {
         this.teamName = teamName;
         this.name = name;
         this.name2 = name2;
         this.name3 = name3;
         this.name4 = name4;
    }

    void Action(int run, int swim, int jump){
         this.run = run;
         this.swim = swim;
         this.jump = jump;
    }

    public String getName(){ //Возращаем имя члена команды
        return name;
    }

    @Override
    public String toString() {
        return "Команда: " + teamName + " --> " + name + " " + name2 + " " + name3 + " " + name4;
    }

    public String teamName() {
         return teamName;
    }
}
