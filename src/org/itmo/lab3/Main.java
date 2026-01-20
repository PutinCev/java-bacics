package org.itmo.lab3;

public class Main {
    public static void main(String[] args) {
        //задание 1.
        System.out.println("задание 1");
        Study study = new Study();
        //первый вариант через метод printCourse()
        System.out.println("Вывожу первый вариант через метод printCourse()");
        System.out.println(study.printCourse());
        //второй вариант через геттер
        System.out.println("Вывожу второй вариант через геттер");
        System.out.println(study.getCourse());
        //задание 2. Авто
        System.out.println("задание 2. Авто");
        System.out.println("Цвет и вес машины установил через конструктор. А Навание через установку параметра через точку");
        Car car = new Car("Черный");
        car.name = "Мерседес";
        Car bigCar = new Car("Желтый",10000.00);
        bigCar.name = "Белаз";
        System.out.println(car.toString());
        System.out.println(bigCar.toString());
        //задание 3. Дом
        System.out.println("задание 3. Дом");
        House house = new House(10,2015,"Platinum");
        System.out.println(house.toString());
        House house2 = new House(12,2021,"Эмеральд");
        System.out.println(house2.toString());
        //задание 4. Дерево
        System.out.println("задание 4. Дерево");
        Tree tree = new Tree(2,"Рябина");
        System.out.println(tree.toString());
        Tree bigTree = new Tree(100, true,"Дуб");
        System.out.println(bigTree.toString());
        Tree greenTree = new Tree();
    }
}
