package practical20;

public class MyGenericClass<T, V, K> {
    private T value1;
    private V value2;
    private K value3;

    public MyGenericClass(T value1, V value2, K value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }

    public K getValue3() {
        return value3;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }

    public void setValue3(K value3) {
        this.value3 = value3;
    }

    public void printValues() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
        System.out.println("Value 3: " + value3);
    }

    public static void main(String[] args) {
        MyGenericClass<Integer, String, Boolean> myClass = new MyGenericClass<>(10, "Hello", true);
        myClass.printValues();

        myClass.setValue1(20);
        myClass.setValue2("World");
        myClass.setValue3(false);

        myClass.printValues();
    }
}
