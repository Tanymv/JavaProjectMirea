package practical29;

import java.util.Scanner;

public class RoadInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] roads = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                roads[i][j] = scanner.nextInt();
            }
        }

        int roadCount = countRoads(roads);
        System.out.println(roadCount);

        scanner.close();
    }

    public static int countRoads(int[][] roads) {
        int roadCount = 0;
        int n = roads.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (roads[i][j] == 1) {
                    roadCount++;
                }
            }
        }

        return roadCount;
    }
}
