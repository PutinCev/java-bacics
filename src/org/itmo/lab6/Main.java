package org.itmo.lab6;

public class Main {

    public static void main(String[] args) {
        // Задание №1
        Client сlient = new Client("Иван", "Петров", "Сбербанк");
        Client сlient2 = new Client("Мария", "Сидорова", "ВТБ");

        BankEmployee employee = new BankEmployee("Алексей", "Иванов", "Сбербанк", "Управляющий");
        BankEmployee employee2 = new BankEmployee("Ольга", "Смирнова", "ВТБ", "Кредитный эксперт");

        // Вывод информации
        System.out.println("Клиенты банков:");
        сlient.vivodInformatsii();
        сlient2.vivodInformatsii();

        System.out.println("Работники банка:");
        employee.vivodInformatsii();
        employee2.vivodInformatsii();

        System.out.println("Имя клиента: " + сlient.getFirstName());
        System.out.println("Фамилия клиента: " + сlient.getSurname());

        //Задание №3
        Truck truck = new Truck(5000, "Volvo FH", 'B', 90.5f, 10, 20000);
        truck.outPut();
        truck.newWheels(12);

        //Задание №4
        HeirСlass heirСlass = new HeirСlass();
        heirСlass.vivodChisla();

        //Задание №5.
        UserAccount user = new UserAccount();
        user.displayUserInfo();

    }
}
