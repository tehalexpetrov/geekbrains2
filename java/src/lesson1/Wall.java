package lesson1;

import java.util.Random;

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
}
