package Homework1;

import java.util.*;
abstract class Pet {
    protected String name, nameOwner;
    protected int age;

    public Pet(String name, String nameOwner, int age) {
        this.name = name;
        this.nameOwner = nameOwner;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", age=" + age +
                '}';
    }
}

class Dog extends Pet {
    public Dog(String name, String nameOwner, int age) {
        super(name, nameOwner, age);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    String getName() {
        String typePet = "Собака";
        return typePet + " " + name;
    }

}

class Cat extends Pet {
    public Cat(String name, String nameOwner, int age) {
        super(name, nameOwner, age);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    String getName() {
        String typePet = "Кошка";
        return typePet + " " + name;
    }

    int getAge() {
        return age;
    }

}

class Main {
    public static void sortCat(ArrayList<Cat> arr) {
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size()-1; j++) {
                if (arr.get(j).getAge() > arr.get(j+1).getAge()) {
                    Cat temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Dog> Dogs = new ArrayList<>();
        ArrayList<Cat> Cats = new ArrayList<>();

        Dogs.add(new Dog("Персик", "Стас", 1));
        Dogs.add(new Dog("Мухтар", "Максим", 10));

        Cats.add(new Cat("Сонька", "Елена", 5));
        Cats.add(new Cat("Мурка", "Вика", 3));
        Cats.add(new Cat("Лучик", "Артем", 7));

        sortCat(Cats);
        System.out.println("Собаки:\n" +
                Dogs.get(0).getName() + "\n" +
                Dogs.get(1).getName() + "\n" +
                "Кошки:\n" +
                Cats.get(0).getName() + "\n" +
                Cats.get(1).getName() + "\n" +
                Cats.get(2).getName());
    }
}