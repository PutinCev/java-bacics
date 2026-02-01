package org.itmo.lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Строим самолет:");
        Airplane sam3 = new Airplane("Сухой Суперджет");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес левого крыла");
        int WLK = scanner.nextInt();
        Airplane.Krylo kryloLeft = sam3.new Krylo(WLK, "левое");
        System.out.println("Введите вес правого крыла");
        int WRK = scanner.nextInt();
        Airplane.Krylo kryloRight = sam3.new Krylo(WRK, "правое");
        System.out.println("Самолет: " + "Сухой Суперджет");
        kryloLeft.showWeight();
        kryloRight.showWeight();
        System.out.println("Общий вес крыльев: " +(kryloLeft.getWeight() + kryloRight.getWeight()) + " кг");
    }
}
