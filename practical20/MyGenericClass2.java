package practical20;

public record MyGenericClass2<T, V, K>(T value1, V value2, K value3) {

    public void printClassNames() {
        System.out.println("Class of value1: " + value1.getClass().getName());
        System.out.println("Class of value2: " + value2.getClass().getName());
        System.out.println("Class of value3: " + value3.getClass().getName());
    }

    public static void main(String[] args) {
        MyGenericClass2<Integer, String, Boolean> myClass = new MyGenericClass2<>(10, "Hello", true);
        myClass.printClassNames();
    }
}
