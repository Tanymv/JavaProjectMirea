package practical8;

public class First {

    public static void main(String[] args) {

        f(10);

    }

    public static void f(int n) {

        int i = 1;

        int j = 0;

        for (int k = 0; k < n; k++) {

            System.out.print(i + " ");

            j += 1;

            if (j == i) {

                i += 1;

                j = 0;

            }

        }

        System.out.println();

    }

}