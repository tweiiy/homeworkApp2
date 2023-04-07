package org.example;
import java.util.Arrays;

public class Main {
    //Метод для замены 0 на 1 и 1 на 0 в целочисленном массиве
    public static void flipZerosAndOnes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
    }
    //Метод для заполнения пустого целочисленного массива длиной 100 значениями от 1 до 100
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
    //Метод для умножения чисел меньше 6 на 2 в целочисленном массиве
    public static void multiplySmallNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
    }
    //Метод для заполнения диагональных элементов квадратного двумерного целочисленного массива единицами
    public static void fillDiagonal(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1; // главная диагональ
            arr[i][n-i-1] = 1; // побочная диагональ
        }
    }
    //Метод для создания одномерного целочисленного массива заданной длины и значениями, равными заданному initialValue
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    //Метод для поиска минимального и максимального элементов в одномерном целочисленном массиве
    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
    //Метод для проверки наличия места в одномерном целочисленном массиве, где сумма левой и правой частей равны
    public static boolean checkBalance(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            sumRight += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            sumRight -= arr[i];
            if (sumLeft == sumRight)
                return true;
        }
        return false;
    }
    //Метод для циклического смещения элементов одномерного целочисленного массива на n позиций
    public static void shiftArray(int[] arr, int n) {
        int len = arr.length;
        if (n < 0) {
            n = len - (-n % len);
        }
        n = n % len;
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            int last = arr[len - 1];
            for (int j = len - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }
}