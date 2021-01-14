package lesson2;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(int i, int j){
        super("Не удалось преобразовать элемент массива к числу (" + i + "," + j + ")");
    }
}
