package org.itmo.lab6;

import java.util.Scanner;

public abstract class UserProfile {
    protected static Scanner scanner;

    public UserProfile() {
        scanner = new Scanner(System.in);
    }

    public String getInfoUser() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextLine();
    }

    public void displayUserInfo() {
        String age = getInfoUser();
        System.out.println("\nИнформация о пользователе:");
        System.out.println("Возраст пользователя: " + age);
    }

}
