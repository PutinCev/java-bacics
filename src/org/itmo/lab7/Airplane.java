package org.itmo.lab7;

public class Airplane {

    private String model;
    private Krylo leftKrylo;
    private Krylo rightKrylo;

    // Конструктор самолета
    public Airplane(String model) {
        this.model = model;
    }

    // Метод для отображения информации о самолете
    public void showInfo() {
        System.out.println("Самолет: " + model);
        if (leftKrylo != null) {
            leftKrylo.showWeight();
        }
        if (rightKrylo != null) {
            rightKrylo.showWeight();
        }
        if (leftKrylo != null && rightKrylo != null) {
            System.out.println("Общий вес крыльев: " +
                    (leftKrylo.getWeight() + rightKrylo.getWeight()) + " кг");
        }
        System.out.println();
    }

    class Krylo {
        private int weight; // вес крыла
        private String side; // сторона (левое/правое)

        public Krylo(int weight, String side) {
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

