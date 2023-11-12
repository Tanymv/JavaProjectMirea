package practical20;

class MinMax<T extends Comparable<T>> {

    private final T[] array;

    public MinMax(T[] array) {

        this.array = array;

    }

    public T findMin() {

        if (array.length == 0) {

            return null;

        }

        T min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i].compareTo(min) < 0) {

                min = array[i];

            }

        }

        return min;

    }

    public T findMax() {

        if (array.length == 0) {

            return null;

        }

        T max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i].compareTo(max) > 0) {

                max = array[i];

            }

        }

        return max;

    }

}

class Calculator {

    public static <T, U extends Number> double sum(T num1, U num2) {

        double value1 = ((Number) num1).doubleValue();

        double value2 = num2.doubleValue();

        return value1 + value2;

    }

    public static <T, U extends Number> double multiply(T num1, U num2) {

        double value1 = ((Number) num1).doubleValue();

        double value2 = num2.doubleValue();

        return value1 * value2;

    }

    public static <T, U extends Number> double divide(T num1, U num2) {

        double value1 = ((Number) num1).doubleValue();

        double value2 = num2.doubleValue();

        if (value2 == 0) {

            throw new IllegalArgumentException("Cannot divide by zero");

        }

        return value1 / value2;

    }

    public static <T, U extends Number> double subtract(T num1, U num2) {

        double value1 = ((Number) num1).doubleValue();

        double value2 = num2.doubleValue();

        return value1 - value2;

    }

}

class Main {

    public static void main(String[] args) {

        Integer[] numbers = {5, 3, 8, 2, 10};

        MinMax<Integer> minMax = new MinMax<>(numbers);

        System.out.println("Min: " + minMax.findMin());

        System.out.println("Max: " + minMax.findMax());

        System.out.println("Sum: " + Calculator.sum(5, 3.5));

        System.out.println("Multiplication: " + Calculator.multiply(5, 3.5));

        System.out.println("Division: " + Calculator.divide(7, 2));

        System.out.println("Subtraction: " + Calculator.subtract(7.5, 3));

    }

}
