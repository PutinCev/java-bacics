package org.itmo.lab6;

public class Truck extends Car {
    private int numberOfWheels;
    private int weightLimit;

    // Конструктор, устанавливающий все значения
    public Truck(int weight, String model, char color, float speed,
                 int numberOfWheels, int weightLimit) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.weightLimit = weightLimit;
    }

    // Метод для установки нового количества колес
    public void newWheels(int newKolesa) {
        this.numberOfWheels = newKolesa;
        System.out.println("Новое количество колес: " + this.numberOfWheels);
    }

    // Переопределение метода вывода для отображения всех полей
    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес: " + numberOfWheels);
        System.out.println("Максимальный вес: " + weightLimit + "кг");
    }

    // Геттеры и сеттеры
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getWeightLimit() {
        return weightLimit;
    }
}
