package practical25;

import java.util.Scanner;

public class StringManipulationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.println("Выберите действие:");
        System.out.println("1. Разбить строку на слова");
        System.out.println("2. Разбить строку на числа");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                String[] words = input.split("\\s+"); // Разделение строки на слова с использованием регулярного выражения по пробелам
                System.out.println("Результат:");
                for (String word : words) {
                    System.out.println(word);
                }
                break;

            case 2:
                String[] numbers = input.split("[^0-9]+"); // Разделение строки на числа с использованием регулярного выражения, выбирающего только цифры
                System.out.println("Результат:");
                for (String number : numbers) {
                    System.out.println(number);
                }
                break;

            default:
                System.out.println("Некорректный выбор.");
                break;
        }

        scanner.close();
    }
}

