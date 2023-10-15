package practical3;
import java.util.*;

public class Third {
    public static boolean isGrow(int[] arg) {
        for (int i = 0; i < arg.length - 1; i++) {
            if (arg[i] > arg[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[4];
        System.out.print("Массив: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nСтрого возрастающая ли последовательность: " + isGrow(array));
    }
}
