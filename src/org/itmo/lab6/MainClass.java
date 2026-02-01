package org.itmo.lab6;

import java.util.Scanner;

public class MainClass {

    protected int celoeChislo;
    protected Scanner scanner;

    public MainClass() {
        scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        celoeChislo = scanner.nextInt();
    }
}

