package org.itmo.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        viewResultTask1();
        viewResultTask2();
        viewResultTask3();
        viewResultTask4();
        viewResultTask5();
        viewResultTask6();
    }
    public static void viewResultTask1() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }
    public static void viewResultTask2() {
        double x = (46+10)*(10d/3);
        int y = (29)*(4)*(-15);
        System.out.println(x);
        System.out.println(y);
    }
    public static void viewResultTask3() {
        int number = 10500;
        int result = (number/10)/10;
        System.out.println(result);
    }
    public static void viewResultTask4() {
        double x = 3.6;
        double y = 4.1;
        double z = 5.9;
        double result = x*y*z;
        System.out.println(result);
    }
    public static void viewResultTask5() {
        Scanner scanner = new Scanner(System.in);
         //если колекции нельзя пока использовать, то
        System.out.println("Введите 5 чисел");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int m4 = scanner.nextInt();
        int m5 = scanner.nextInt();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        //Если колекции можно, то с использованием массива
        System.out.println("Введите в МАССИВ 5 чисел");
        int[] m = new int[5];
        for (int i = 0; i < 5; i++) {
            m[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(m[i]);
        }
    }
    public static void viewResultTask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int b = scanner.nextInt();
        System.out.println(getInfo(b));
    }
    public static String getInfo(int b){
        if ((double)b % 2 == 0) {
            return "Четное";
        } else if (b <= 100) {
            return "Нечетное";
        } else return "Выход за пределы диапазона";
    }
}
