package lesson1;

public class Main {
    public static void main(String[] args) {
        Team team1 = Team.BIRDS;

        for (Team team: Team.values()) {
            System.out.println("Комнда  --> " + team);
            System.out.println(Team.values().toString());
        }
    }
}
