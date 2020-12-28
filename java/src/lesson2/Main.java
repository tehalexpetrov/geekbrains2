package lesson2;

public class Main {

    private static final int MassI = 4;
    private static final int MassJ = 4;
    private static final String point = String.valueOf('*');


    public static void main(String[] args) {
        String[][] massArray = new String[MassI][MassJ];
        try {



        } catch (Exception e) {

        }
    }

    public void stringExection(String[][] massArray) throws MyArraySizeException {
        if(massArray.length != MassI || massArray.length != MassJ ) throw new MyArraySizeException("Неверное количество строк"); {
            for (int i = 0; i < massArray.length; i++) {
                if (massArray[i].length != MassI || massArray.length != MassJ) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" + " строке", i));{
                    for (int j = 0; j < massArray[i].length; j++) {
                        System.out.print(massArray[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
