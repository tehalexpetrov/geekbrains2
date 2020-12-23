package lesson1;

public class Team {
    protected String teamName;
    private String name;
    private final String name2;
    private final String name3;
    private final String name4;


    /* Создаем поля класса */
    public Team(String teamName, String name, String name2, String name3, String name4) {
        this.teamName = teamName;
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }

    public String teamName() {
        return teamName;
    }

    /*public void printTeamName(){
        System.out.println(this);
    }*/

    @Override
    public String toString() {
        return "Команда: " + teamName + " --> " + name + " " + name2 + " " + name3 + " " + name4;
    }
}
