package lesson1;

public class Main {
    public static void main(String[] args) {
        Team team1 = Team.BIRDS;
        Team team2 = Team.LION;

        Course course1 = Course.COURSE;
        Course course2 = Course.COURSE2;

        System.out.println("Команда " + team1.teamName() + " " + course1);
        System.out.println("Команда " + team2.teamName() + " " + course2);

        for (Team team: Team.values()) {
           //System.out.println(team1.teamName());
        }

        for (Course course: Course.values()) {
//            System.out.println(course);
        }

    }
}
