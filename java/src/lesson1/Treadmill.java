package lesson1;

public class Treadmill extends Barrier {

    private int distance;

    public Treadmill(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }


    @Override
    protected boolean isAction(Limitations limitations) {
        System.out.println("ДЛИНА ДОРОЖКИ --> " + this.distance);
        limitations.run();

        if (getDistance() <= limitations.doRun()) {
            System.out.println("\tТы отличный бегун! Молодец");
            return true;
        } else {
            System.out.println("\tТебе еще бегать и бегать!");
            return false;
        }
    }
}

