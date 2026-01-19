package org.itmo.lab2;

import java.util.Scanner;
import org.itmo.lab2.Calculator;


public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(false,1);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = calc2.addition(a,b);
        System.out.println("Сложение интов:");
        System.out.println(c);

        double d = scanner.nextDouble();
        double f = scanner.nextDouble();
        double g = calc2.addition(d,f);
        System.out.println("Сложение даблов:");
        System.out.println(g);

        long h = scanner.nextLong();
        long j = scanner.nextLong();
        long k = calc2.addition(h,j);
        System.out.println("Сложение лонгов:");
        System.out.println(k);

    }
}
