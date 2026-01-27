package org.itmo.lab4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static int[] m = new int[5];
    public static int[] newArray;
    public static int a;
    public static int b;
    public static int c;


    public static void main(String[] args) {
        viewResultOfTask1();
        viewResultOfTask2();
        viewResultOfTask3();
        viewResultOfTask4();
        viewResultOfTask5();
        viewResultOfTask6();
        viewResultOfTask21();
        viewResultOfTask22(true);
        viewResultOfTask23();
        viewResultOfTask24();
        viewResultOfTask25();
    }

    public static ArrayList findOdd(int limit) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (double i = 1; i < limit; i++) {
            if (i % 2 != 0) {
                oddNumbers.add((int) i);
            }
        }
        return oddNumbers;
    }

    public static void viewResultOfTask1() {
        ArrayList<Integer> arrayOfOddNumbers = findOdd(100);
        String result = arrayOfOddNumbers.toString();
        result = result.replaceAll("[\\\\\\[\\]]", "");
        result = result.replaceAll(", ", "\n");
        System.out.println(result);
    }

    public static void findDivisible(StringBuilder divisibleBy3, StringBuilder divisibleBy5, StringBuilder divisibleBy3And5) {
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
    }


    public static void viewResultOfTask2() {
        StringBuilder divisibleBy3 = new StringBuilder("Делится на 3: ");
        StringBuilder divisibleBy5 = new StringBuilder("Делится на 5: ");
        StringBuilder divisibleBy3And5 = new StringBuilder("Делится на 3 и на 5: ");
        findDivisible(divisibleBy3, divisibleBy5, divisibleBy3And5);
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3And5);
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    public static boolean toCompare(int a, int b, int c, int type) {
        if (type == 1) {
            return (c == sum(a, b));
        } else {
            return (b > a && c > b);
        }
    }

    public static void еnterValues() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    public static void viewResultOfTask3() {
        System.out.println("Введите 3 целых числа");
        еnterValues();
        int aPlusB = sum(a, b);
        Boolean compareC = toCompare(a, b, c, 1);
        System.out.println(aPlusB);
        System.out.println(compareC);
    }

    public static void viewResultOfTask4() {
        еnterValues();
        int aPlusB = sum(a, b);
        Boolean compareC = toCompare(a, b, c, 2);
        System.out.println(aPlusB);
        System.out.println(compareC);
    }

    public static void generateAnArrayOfNumbers(int[] m, StringBuilder strArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите в МАССИВ 5 чисел");
        for (int i = 0; i < 5; i++) {
            m[i] = scanner.nextInt();
            if (i != 0) strArray.append(", ");
            strArray.append(m[i]);
        }
    }

    public static Boolean find3(int[] m) {
        Boolean isFound = false;
        if (m[0] == 3 || m[m.length - 1] == 3) {
            isFound = true;
        } else {
            isFound = false;
        }
        return isFound;
    }

    public static Boolean find1Or3(int[] m) {
        Boolean isFound = false;
        for (int i = 0; i < 5; i++) {
            if (m[i] == 1 || m[i] == 3) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public static void viewResultOfTask5() {

        int[] m = new int[5];
        StringBuilder strArray = new StringBuilder("array = ");
        generateAnArrayOfNumbers(m, strArray);
        Boolean isFound = find3(m);
        System.out.println(strArray);
        System.out.println(isFound);
    }

    public static void viewResultOfTask6() {
        int[] m = new int[5];
        StringBuilder strArray = new StringBuilder("array = ");
        generateAnArrayOfNumbers(m, strArray);
        Boolean isFound = find1Or3(m);
        System.out.println(isFound);
    }

    private static String checkSortOfgArray(int[] m) {
        String stringOfSorted = "ОК";
        for (int i = 0; i < 5; i++) {
            if (i > 0 && m[i] < m[i - 1]) {
                stringOfSorted = "Please, try again";
                break;
            }
        }
        return stringOfSorted;
    }


    public static void viewResultOfTask21() {
        int[] m = new int[5];
        StringBuilder strArray = new StringBuilder("array = ");
        generateAnArrayOfNumbers(m, strArray);
        String stringOfSorted = checkSortOfgArray(m);
        System.out.println(stringOfSorted);
    }

    public static int[] generateAnArrayOfTheSpecifiedLength(int length, Boolean showResult) {
        int[] newArray = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            newArray[i] = scanner.nextInt();
        }
        if (showResult == true) {
            System.out.println("Result: " + Arrays.toString(newArray));
        }
        return newArray;

    }

    public static int[] viewResultOfTask22(Boolean showResult) {
        int length;
        System.out.println("Введите длину массива целых чисел");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        System.out.println("Array length: " + length);
        int[] newArray = generateAnArrayOfTheSpecifiedLength(length, showResult);
        return newArray;
    }

//    public static void showArray(int number) {
//        String strNumber = "";
//        if (number > 0) {
//            strNumber = "" + number;
//        }
//        String strArray = "Array " + strNumber + ": [";
//        for (int i = 0; i < newArray.length; i++) {
//            if (i != 0) strArray = strArray + ", ";
//            strArray = strArray + newArray[i];
//        }
//        strArray = strArray + "]";
//        System.out.println(strArray);
//    }

    public static void viewResultOfTask23() {
        System.out.println("Поменяем местами первый и последний элемент массива, но для начала сформируем массив");
        newArray = viewResultOfTask22(false);
        System.out.println("Array 1: " + Arrays.toString(newArray));
        int valueA = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = valueA;
        System.out.println("Array 2: " + Arrays.toString(newArray));
    }

    public static Integer findFirstUniqueNumber(int[] newArray) {
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
                return (Integer) newArray[i];
            }
        }
        return (Integer)null;
    }

    public static void viewResultOfTask24() {
        System.out.println("Найдем первое уникальное в массиве число, но для начала сформируем массив");
        int[] newArray = viewResultOfTask22(false);
        Integer firstUniqueNumber = findFirstUniqueNumber(newArray);
        if (firstUniqueNumber == null){
            System.out.println("Уникальных чисел нет");
        }
        else {
            System.out.println("Первое уникальное число " + firstUniqueNumber);
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

