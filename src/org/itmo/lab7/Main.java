package org.itmo.lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Строим самолет:");
        Airplane sam3 = new Airplane("Сухой Суперджет");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес левого крыла");
        int WLK = scanner.nextInt();
        Airplane.Wing wingLeft = sam3.new Wing(WLK, "левое");
        System.out.println("Введите вес правого крыла");
        int WRK = scanner.nextInt();
        Airplane.Wing wingRight = sam3.new Wing(WRK, "правое");
        System.out.println("Самолет: " + "Сухой Суперджет");
        wingLeft.showWeight();
        wingRight.showWeight();
        System.out.println("Общий вес крыльев: " +(wingLeft.getWeight() + wingRight.getWeight()) + " кг");
    }
}
