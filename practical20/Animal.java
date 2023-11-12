package practical20;

import java.io.Serializable;

interface Animal {
    void makeSound();
}

class Dog implements Animal, Serializable {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal, Serializable {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class MyGenericClass3<T extends Comparable<T>, V extends Serializable & Animal, K> {
    private final T value1;
    private final V value2;
    private final K value3;

    public MyGenericClass3(T value1, V value2, K value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public void printValues() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
        System.out.println("Value 3: " + value3);
    }

    public static void main(String[] args) {
        // Пример использования класса
        MyGenericClass3<Integer, Dog, String> myClass1 = new MyGenericClass3<>(10, new Dog(), "Hello");
        myClass1.printValues();

        MyGenericClass3<String, Cat, Integer> myClass2 = new MyGenericClass3<>("World", new Cat(), 20);
        myClass2.printValues();
    }
}
