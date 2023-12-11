package practical26;

import java.util.Stack;

public class ArrayReversal {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Исходный массив:");
        printArray(array);

        reverseArray(array);

        System.out.println("Инвертированный массив:");
        printArray(array);
    }

    public static void reverseArray(char[] array) {
        Stack<Character> stack = new Stack<>();

        for (char c : array) {
            stack.push(c);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void printArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}