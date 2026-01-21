package org.itmo.lab3;

public class Car {
    public String color;
    public String name;
    public Double weight;

    public Car(String color){
        this.color=color;
    }
    public Car(String color,Double weight){
        this.color=color;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
