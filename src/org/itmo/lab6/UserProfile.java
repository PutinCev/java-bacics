package org.itmo.lab6;

import java.util.Scanner;

public class UserProfile {
    protected Scanner scanner;

    public UserProfile() {
        scanner = new Scanner(System.in);
    }

      public int getAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }

    public String getName() {
        System.out.print("Введите ваше имя: ");
        scanner.nextLine(); // Очистка буфера
        return scanner.nextLine();
    }


}
