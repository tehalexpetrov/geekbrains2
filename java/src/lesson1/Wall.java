package lesson1;

public class Wall {
    protected int height;

    public Wall(int height ){
        this.height = height;
    }

    public int getHeight(){ // Получаем ограничение на высоту стены
        return height;
    }

    @Override
    public String toString() {
        return "Стена высотой " + height;
    }

    int wallInfo(){
        return height;
    }
}
