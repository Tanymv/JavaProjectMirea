package practical14;
import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = src.nextLine();
        String[] items = input.split("\\s+");

        System.out.println("Элементы строки:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
