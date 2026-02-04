package org.itmo.lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Строим самолет:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес левого крыла");
        int wl = scanner.nextInt();
        System.out.println("Введите вес правого крыла");
        int wr = scanner.nextInt();
        Airplane sam3 = new Airplane("Сухой Суперджет",wl,wr);
        System.out.println("Самолет: " + "Сухой Суперджет");
        Airplane.Wing wingLeft = sam3.getLeftWing();
        Airplane.Wing wingRight = sam3.getRightWing();
        wingLeft.showWeight();
        wingRight.showWeight();
        System.out.println("Общий вес крыльев: " +(wingLeft.getWeight() + wingRight.getWeight()) + " кг");
    }
}
