package lesson1;

public class Main {


    public static void main(String[] args) {
        Team team1 = new Team("Birds","Андрей","Максим", "Вячеслав", "Константин");
        Team team2 = new Team("Lion","Александр", "Олег", "Анатолий", "Павел");

        Course course1 = new Course(10 , 5, 1);
        Course course2 = new Course(8, 4,1);


        printInfo();


       /* for (Team team: teamArray) {
            System.out.println(team + " --> Пробежали " + course1.actionRun() + " км");
        }
*/
    }

    public static void printInfo(){

    }
}
