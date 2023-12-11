package practical32;

import java.util.ArrayList;
import java.util.List;

public class JohnsonTrotterPermutations {
    public static List<int[]> generatePermutations(int n) {
        List<int[]> permutations = new ArrayList<>();

        int[] values = new int[n];
        int[] directions = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = i + 1;
            directions[i] = -1;
        }

        permutations.add(values.clone());

        int mobileIndex = getLargestMobileIndex(values, directions);
        while (mobileIndex != -1) {
            int mobileValue = values[mobileIndex];
            int neighborIndex = mobileIndex + directions[mobileIndex];
            int neighborValue = values[neighborIndex];

            values[mobileIndex] = neighborValue;
            values[neighborIndex] = mobileValue;

            for (int i = 0; i < n; i++) {
                if (values[i] > mobileValue) {
                    directions[i] *= -1;
                }
            }

            mobileIndex = getLargestMobileIndex(values, directions);

            permutations.add(values.clone());
        }

        return permutations;
    }

    private static int getLargestMobileIndex(int[] values, int[] directions) {
        int mobileIndex = -1;
        int maxMobileValue = 0;

        for (int i = 0; i < values.length; i++) {
            int currentValue = values[i];
            int currentDirection = directions[i];

            if ((currentDirection == -1 && i > 0 && currentValue > values[i - 1]) ||
                    (currentDirection == 1 && i < values.length - 1 && currentValue > values[i + 1])) {
                if (currentValue > maxMobileValue) {
                    maxMobileValue = currentValue;
                    mobileIndex = i;
                }
            }
        }

        return mobileIndex;
    }

    public static void main(String[] args) {
        int n = 4;
        List<int[]> permutations = generatePermutations(n);

        System.out.println("Перестановки:");
        for (int[] permutation : permutations) {
            for (int i : permutation) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
