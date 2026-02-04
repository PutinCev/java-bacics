package org.itmo.lab6;

public class UserAccount extends UserProfile {

    public UserAccount() {
        super();
    }
    @Override
    public String getInfoUser() {
        System.out.print("Введите ваше полное имя (ФИО): ");
        return scanner.nextLine();
    }

    @Override
    public void displayUserInfo() {
        String name = getInfoUser();
        System.out.println("\nИнформация о пользователе:");
        System.out.println("Имя: " + name);
        String age = super.getInfoUser();
        System.out.println("Возраст: " + age);
    }
}
