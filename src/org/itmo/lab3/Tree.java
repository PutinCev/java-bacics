package org.itmo.lab3;

public class Tree {
    public Integer age;
    public Boolean isAlive;
    public String name;

    public Tree(Integer age, String name){
        this.age = age;
        this.name = name;
    }
    public Tree(Integer age, Boolean isAlive, String name){
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
