package lesson5;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        Main test = new Main();
            test.oneMethod();
    }

    //Создаем первый метод

    public float[] calcArray(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    public void oneMethod() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {arr[i] = 1.0f;}
        long a = System.currentTimeMillis();
        calcArray(arr);
        System.out.println("Потрачено --> " + (System.currentTimeMillis() - a) + " миллисекунд(а)");
    }

    //Создаем второй метод


}
