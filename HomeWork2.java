import java.util.Arrays;

public class HomeWork2
{   //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void main(String[] args) {
    }
    public static void invertArray() {
        int[] arr1 = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0 ) {
                arr1[i] =1;
            } else {
                arr1[i] =0;
            }
        } System.out.println(Arrays.toString(arr1));
    }
    //2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void fillArray() {
            int[] arr = new int[8];
            int j = 0;
            for (int i = 0; i < arr.length; i++, j = j + 3)
        {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr) );

        }
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
        }System.out.println(Arrays.toString(w));
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((j == i) | (j==0 & i==3) | (j==1 & i==2) | (j==2 & i==1) | (j==3 & i==0)) {
                    arr[i][j] = 1;
                }
            } System.out.println(Arrays.toString(arr[i]));
        }
    }






}
