package lesson1;

public class Wall extends Barrier{

    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeigth() {
        return height;
    }


    @Override
    protected boolean isAction(Limitations limitations) {
        System.out.println("ВЫСОТА СТЕНЫ --> " + this.height);
        limitations.jump();

        if (getHeigth() <= limitations.doJump()){
            System.out.println("Ты отличный прыгун! Молодец");
            return true;
        } else {
            System.out.println("Тебе еще прыгать и прыгать! Учись студент.");
            return  false;
        }
    }
}
