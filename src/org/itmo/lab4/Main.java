package org.itmo.lab4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Программа, которая выводит на консоль нечетные числа от 1 до 99 //viewResultOfTask1();
        String result = findOdd(100);
        System.out.println(result);

        //2. программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
        // viewResultOfTask2();
        StringBuilder divisibleBy3 = new StringBuilder("Делится на 3: ");
        StringBuilder divisibleBy5 = new StringBuilder("Делится на 5: ");
        StringBuilder divisibleBy3And5 = new StringBuilder("Делится на 3 и на 5: ");
        findDivisible(divisibleBy3, divisibleBy5, divisibleBy3And5);
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3And5);

        //3.Программа, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
        // viewResultOfTask3();
        System.out.println("Введите 3 целых числа");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int aPlusB = sum(a, b);
        System.out.println(aPlusB);
        Boolean compareC = toCompare(a, b, c, 1);
        System.out.println(compareC);

        //4. Программа, которая принимает от пользователя три целых числа и возвращает true,
        // если второе число больше первого числа, а третье число больше второго числа viewResultOfTask4();
        System.out.println("Введите 3 целых числа");
        //Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        Boolean compareC4 = toCompare(a, b, c, 2);
        System.out.println(compareC4);
        //5. программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел
//        viewResultOfTask5();
        int[] m = new int[5];
        StringBuilder strArray = new StringBuilder("array = ");
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите в МАССИВ 5 чисел");
        for (int i = 0; i < 5; i++) {
            m[i] = scanner.nextInt();
            if (i != 0) strArray.append(", ");
            strArray.append(m[i]);
        }
        Boolean isFound = find3(m);
        System.out.println(strArray);
        System.out.println(isFound);

        //6. Программа, чтобы проверить, что массив содержит число 1 или 3
//        viewResultOfTask6();
        int[] m6 = new int[5];
        System.out.println("Введите в МАССИВ 5 чисел");
        for (int i = 0; i < 5; i++) {
            m6[i] = scanner.nextInt();
            strArray.append(m6[i]);
        }
        Boolean isFound6 = find1Or3(m6);
        System.out.println(isFound6);

        // 21. программу, которая проверяет отсортирован ли массив по возрастанию.
        // Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
        //  viewResultOfTask21();
        int[] m21 = new int[5];
        System.out.println("Введите в МАССИВ 5 чисел");
        for (int i = 0; i < 5; i++) {
            m21[i] = scanner.nextInt();
            strArray.append(m21[i]);
        }
        String stringOfSorted = checkSortOfgArray(m21);
        System.out.println(stringOfSorted);

        //22. Программа, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
        // затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов
        // viewResultOfTask22(true);
        System.out.println("Введите длину массива целых чисел");
        int length = scanner.nextInt();
        System.out.println("Array length: " + length);
        int[] newArray = generateAnArrayOfTheSpecifiedLength(length, true);

        //23. Программа, которая меняет местами первый и последний элемент массива
        //viewResultOfTask23();
        System.out.println("Поменяем местами первый и последний элемент массива, но для начала сформируем массив");
        System.out.println("Введите длину массива целых чисел");
        int length23 = scanner.nextInt();
        System.out.println("Array length: " + length23);
        int[] newArray23 = generateAnArrayOfTheSpecifiedLength(length23, false);
        changeArray(newArray23);

        //24. Найти первое уникальное в этом массиве число.
        //viewResultOfTask24();
        System.out.println("Найдем первое уникальное в массиве число, но для начала сформируем массив");
        System.out.println("Введите длину массива целых чисел");
        int length24 = scanner.nextInt();
        System.out.println("Array length: " + length24);
        int[] newArray24 = generateAnArrayOfTheSpecifiedLength(length24, false);
        Integer firstUniqueNumber = findFirstUniqueNumber(newArray24);
        if (firstUniqueNumber == null){
            System.out.println("Уникальных чисел нет");
        }
        else {
            System.out.println("Первое уникальное число " + firstUniqueNumber);
        }

        //25.	Заполнение массива случайным числами и сортировка его
        //viewResultOfTask25();
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
    //1.Основной метод для программы, которая выводит на консоль нечетные числа от 1 до 99
    public static String findOdd(int limit) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (double i = 1; i < limit; i++) {
            if (i % 2 != 0) {
                oddNumbers.add((int) i);
            }
        }
        String result = oddNumbers.toString();
        result = result.replaceAll("[\\\\\\[\\]]", "");
        result = result.replaceAll(", ", "\n");
        return result;
    }
    //2.Основной метод для программы, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5)
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

    // 3. Методы для программы, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
    public static int sum(int a, int b) {
        return (a + b);
    }
    //3 и 4. Медод для программы, которая принимает от пользователя три целых числа и возвращает true,
    // если второе число больше первого числа, а третье число больше второго числа
    public static boolean toCompare(int a, int b, int c, int type) {
        if (type == 1) {
            return (c == sum(a, b));
        } else {
            return (b > a && c > b);
        }
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
    //5. Метод программы, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел
    public static Boolean find3(int[] m) {
        Boolean isFound = false;
        if (m[0] == 3 || m[m.length - 1] == 3) {
            isFound = true;
        } else {
            isFound = false;
        }
        return isFound;
    }
    //6. Метод программы, чтобы проверить, что массив содержит число 1 или 3
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
    //21. Метод программы, которая проверяет отсортирован ли массив по возрастанию.
    // Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
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
    //22. Метод программы, которая считывает с клавиатуры длину массива и на новой строке выводится массив
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

     //23. Метод, который меняет местами первый и последний элемент массива
     public static void changeArray(int[] newArray){
         System.out.println("Array 1: " + Arrays.toString(newArray));
         int valueA = newArray[0];
         newArray[0] = newArray[newArray.length - 1];
         newArray[newArray.length - 1] = valueA;
         System.out.println("Array 2: " + Arrays.toString(newArray));
     }

    //24. Метод поиска первого уникальное в массиве числа.
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

    // 25. Метод для генерации массива случайных чисел
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

