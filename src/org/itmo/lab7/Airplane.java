package org.itmo.lab7;

public class Airplane {

    private String model;
    private Wing leftWing;
    private Wing rightWing;

    // Конструктор самолета
    public Airplane(String model){
        this.model = model;
    }

    // Метод для отображения информации о самолете
    public void showInfo() {
        System.out.println("Самолет: " + model);
        if (leftWing != null) {
            leftWing.showWeight();
        }
        if (rightWing != null) {
            rightWing.showWeight();
        }
        if (leftWing != null && rightWing != null) {
            System.out.println("Общий вес крыльев: " +
                    (leftWing.getWeight() + rightWing.getWeight()) + " кг");
        }
        System.out.println();
    }

    class Wing {
        private int weight; // вес крыла
        private String side; // сторона (левое/правое)

        public Wing(int weight, String side) {
            this.weight = weight;
            this.side = side;
        }

        public void showWeight() {
            System.out.println("Вес " + side + " крыла: " + weight + " кг");
        }

        // Метод для получения веса крыла
        public int getWeight() {
            return weight;
        }
    }
}

