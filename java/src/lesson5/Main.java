package lesson5;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        Main test = new Main();
            test.oneMethod();
            test.twoMethod();
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
        public void twoMethod(){
            float[] arr = new float[size];
            float[] arr1 = new float[h];
            float[] arr2 = new float[h];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1.0f;
            }

            long a = System.currentTimeMillis();
            System.arraycopy(arr,0, arr1,0,h);
            System.arraycopy(arr, h, arr2, 0,h);

            new Thread(){
                public void run(){
                    float[] a1 = calcArray(arr1);
                    System.arraycopy(a1, 0, arr1, 0, a1.length);
                }
            }.start();

            new Thread() {
                public void run() {
                    float[] a2 = calcArray(arr2);
                    System.arraycopy(a2, 0, arr2, 0, a2.length);
                }
            }.start();

            System.arraycopy(arr1, 0, arr, 0, h);
            System.arraycopy(arr2, 0, arr, h, h);
            System.out.println("Время выполнения второго метода: " + (System.currentTimeMillis() - a));

        }

}
