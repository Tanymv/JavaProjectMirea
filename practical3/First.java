package practical3;
import java.util.*;

public class First {
    public static void main(String[] arg) {
        Random rand = new Random();
        Scanner src = new Scanner(System.in);
        System.out.print("Введите длинну массива:");
        int n = src.nextInt();
        double[] first = new double[n];
        double[] second = new double[n];
        for (int i = 0; i < n; i++) {
            first[i] = (rand.nextDouble());
            second[i] = (Math.random());
        }

        System.out.println("Массивы:");
        for (int i = 0; i < n; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(second[i] + " ");
        }

        Arrays.sort(first);
        Arrays.sort(second);
        System.out.println("\nОтсортированные массивы:");
        for (int i = 0; i < n; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(second[i] + " ");
        }
    }
}
