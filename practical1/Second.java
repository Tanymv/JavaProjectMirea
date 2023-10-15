package practical1;
import java.util.*;

public class Second {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int i = 0;
        System.out.println("Введите элементы массива: ");
        while (i < 10){
            a[i] = s.nextInt();
            sum += a[i];
            i++;
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Макс = " + Arrays.stream(a).max().getAsInt());
        System.out.println("Мин = " + Arrays.stream(a).min().getAsInt());
    }
}
