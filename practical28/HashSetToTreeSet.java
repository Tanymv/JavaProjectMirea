package practical28;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {
        // Создание и заполнение HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(10);

        // Преобразование HashSet в TreeSet
        Set<Integer> treeSet = new TreeSet<>(hashSet);

        // Вывод результатов
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
