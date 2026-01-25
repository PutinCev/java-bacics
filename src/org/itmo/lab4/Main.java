package org.itmo.lab4;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int a;
    public static int b;
    public static int c;
    public static int[] m = new int[5];
    public static int[] newArray;

    public static void main(String[] args) {
        viewResultOfTask1();
        viewResultOfTask2();
        viewResultOfTask3();
        viewResultOfTask4();
        viewResultOfTask5();
        viewResultOfTask6();
        viewResultOfTask21();
        viewResultOfTask22();
        viewResultOfTask23();
        viewResultOfTask24();
        viewResultOfTask25();
    }

    public static void viewResultOfTask1() {
        for (double i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println((int) i);
            }
        }
    }

    public static void viewResultOfTask2() {
        StringBuilder divisibleBy3 = new StringBuilder("Делится на 3: ");
        StringBuilder divisibleBy5 = new StringBuilder("Делится на 5: ");
        StringBuilder divisibleBy3And5 = new StringBuilder("Делится на 3 и на 5: ");
        boolean first3 = true;
        boolean first5 = true;
        boolean first35 = true;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (!first35) divisibleBy3And5.append(", ");
                divisibleBy3And5.append(i);
                first35 = false;
            }
            if (i % 3 == 0) {
                if (!first3) divisibleBy3.append(", ");
                divisibleBy3.append(i);
                first3 = false;
            }
            if (i % 5 == 0) {
                if (!first5) divisibleBy5.append(", ");
                divisibleBy5.append(i);
                first5 = false;
            }
        }
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3And5);
    }

    public static void еnterValues() {
        System.out.println("Введите 3 целых числа");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    public static void viewResultOfTask3() {
        еnterValues();
        System.out.println(a + b);
        System.out.println(c == a + b);

    }

    public static void viewResultOfTask4() {
        еnterValues();
        System.out.println(a + b);
        System.out.println(b > a && c > b);
    }

    public static void generateAnArrayOfNumbers() {
        m = new int[5]; //перед использования массива почистим его
        StringBuilder strArray = new StringBuilder("array = ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите в МАССИВ 5 чисел");
        for (int i = 0; i < 5; i++) {
            m[i] = scanner.nextInt();
            if (i != 0) strArray.append(", ");
            strArray.append(m[i]);
        }
        System.out.println(strArray);
    }

    public static void viewResultOfTask5() {
        generateAnArrayOfNumbers();
        Boolean isFound = null;
        if (m[0] == 3 || m[m.length - 1] == 3) {
            isFound = true;
        } else {
            isFound = false;
        }
        System.out.println(isFound);
    }

    public static void viewResultOfTask6() {
        generateAnArrayOfNumbers();
        Boolean isFound = false;
        for (int i = 0; i < 5; i++) {
            if (m[i] == 1 || m[i] == 3) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
    }

    public static void viewResultOfTask21() {
        generateAnArrayOfNumbers();
        String stringOfSorted = "ОК";
        for (int i = 0; i < 5; i++) {
            if (i > 0 && m[i] < m[i - 1]) {
                stringOfSorted = "Please, try again";
                break;
            }
        }
        System.out.println(stringOfSorted);
    }

    public static void generateAnArrayOfTheSpecifiedLength(int length) {
        newArray = new int[length];
        StringBuilder strArray = new StringBuilder("Result: [");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length: " + length);
        for (int i = 0; i < length; i++) {
            newArray[i] = scanner.nextInt();
            if (i != 0) strArray.append(", ");
            strArray.append(newArray[i]);
        }
        strArray.append("]");

        System.out.println(strArray);
    }

    public static void viewResultOfTask22() {
        int length;
        System.out.println("Введите длину массива целых чисел");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        generateAnArrayOfTheSpecifiedLength(length);
    }

    public static void showArray(int number) {
        String strNumber = "";
        if (number > 0) {
            strNumber = "" + number;
        }
        String strArray = "Array " + strNumber + ": [";
        for (int i = 0; i < newArray.length; i++) {
            if (i != 0) strArray = strArray + ", ";
            strArray = strArray + newArray[i];
        }
        strArray = strArray + "]";
        System.out.println(strArray);
    }

    public static void viewResultOfTask23() {
        System.out.println("Поменяем местами первый и последний элемент массива, но для начала сформируем массив");
        viewResultOfTask22();
        showArray(1);
        int valueA = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = valueA;
        showArray(2);
    }

    public static void viewResultOfTask24() {
        System.out.println("Найдем первое уникальное в массиве число, но для начала сформируем массив");
        viewResultOfTask22();
        Boolean uniqueNumber;
        for (int i = 0; i < newArray.length; i++) {
            uniqueNumber = true;
            for (int i2 = 0; i2 < newArray.length; i2++) {
                if (i != i2) {
                    if (newArray[i] == newArray[i2]) {
                        uniqueNumber = false;
                        break;
                    }
                }
            }
            if (uniqueNumber == true) {
                System.out.println("Первое уникальное число " + newArray[i]);
                break;
            }
        }
    }

    public static void viewResultOfTask25() {
        // Создаем массив из 10 случайных чисел от 0 до 99
        int[] array = new int[10];
        array = generateRandomArray(10, 0, 100);

        System.out.println("Исходный массив:");
        printArray(array);

        // Сортируем массив слиянием
        mergeSort(array, 0, array.length - 1);

        System.out.println("\nОтсортированный массив (слиянием):");
        printArray(array);
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int size, int min, int max) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер массива должен быть положительным числом");
        }

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    // Основной метод сортировки слиянием
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Находим среднюю точку
            int middle = left + (right - left) / 2;

            // Рекурсивно сортируем левую и правую части
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Сливаем отсортированные части
            merge(array, left, middle, right);
        }
    }

    // Метод для слияния двух отсортированных частей
    public static void merge(int[] array, int left, int middle, int right) {
        // Размеры временных массивов
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Создаем временные массивы
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Копируем данные во временные массивы
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Индексы для слияния
        int i = 0, j = 0;
        int k = left;

        // Сливаем временные массивы обратно в основной
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы leftArray, если есть
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы rightArray, если есть
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

