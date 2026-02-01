package org.itmo.lab6;

public class UserAccount extends UserProfile {
    private String email;

     @Override
    public String getName() {
        System.out.print("Введите ваше полное имя (ФИО): ");
        scanner.nextLine(); // Очистка буфера
        return scanner.nextLine();
    }
    public String getEmail() {
        System.out.print("Введите ваш email: ");
        return scanner.nextLine();
    }

    public void displayUserInfo() {
        String name = getName();
        int age = getAge();
        scanner.nextLine(); // Очистка буфера после nextInt()
        email = getEmail();

        System.out.println("\nИнформация о пользователе:");
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Email: " + email);
    }

}
