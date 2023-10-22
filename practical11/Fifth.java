package practical11;

import java.util.*;
public class Fifth {
    public static void main(String[] args) {
        ArrayList<Integer> ArEx = new ArrayList<>();
        LinkedList<Integer> LiEx = new LinkedList<>();
        long initialTime, estimatedTime;

        initialTime = System.currentTimeMillis();
        ArEx.add(1);
        estimatedTime = System.currentTimeMillis() - initialTime;
        System.out.println("Время добавления ArrayList: " + estimatedTime);

        initialTime = System.currentTimeMillis();
        LiEx.add(2);
        estimatedTime = System.currentTimeMillis() - initialTime;
        System.out.println("Время добавления LinkedList: " + estimatedTime);

        initialTime = System.nanoTime();
        ArEx.remove(0);
        ArEx.add(0, 2);
        estimatedTime = System.nanoTime() - initialTime;
        System.out.println("Время вставки(с заменой) ArrayList: " + estimatedTime);

        initialTime = System.nanoTime();
        LiEx.set(0, 3);
        estimatedTime = System.nanoTime() - initialTime;
        System.out.println("Время вставки(с заменой) LinkedList: " + estimatedTime);

        initialTime = System.nanoTime();
        estimatedTime = System.nanoTime() - initialTime;
        System.out.println("Время поиска ArrayList: " + estimatedTime);

        initialTime = System.nanoTime();
        estimatedTime = System.nanoTime() - initialTime;
        System.out.println("Время поиска LinkedList: " + estimatedTime);

        initialTime = System.nanoTime();
        ArEx.remove(0);
        estimatedTime = System.nanoTime() - initialTime;
        System.out.println("Время удаления ArrayList: " + estimatedTime);

        initialTime = System.nanoTime();
        LiEx.remove();
        estimatedTime = System.nanoTime() - initialTime;
        System.out.println("Время удаления LinkedList: " + estimatedTime);
    }
}
