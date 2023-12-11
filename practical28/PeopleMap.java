package practical28;

import java.util.HashMap;
import java.util.Map;

public class PeopleMap {
    public static void main(String[] args) {
        Map<String, String> people = createMap();

        int sameFirstNameCount = getSameFirstNameCount(people);
        int sameLastNameCount = getSameLastNameCount(people);

        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<>();

        people.put("Иванов", "Алексей");
        people.put("Петров", "Иван");
        people.put("Сидоров", "Алексей");
        people.put("Кузнецов", "Дмитрий");
        people.put("Смирнов", "Иван");
        people.put("Лебедев", "Дмитрий");
        people.put("Васильев", "Алексей");
        people.put("Морозов", "Иван");
        people.put("Николаев", "Алексей");
        people.put("Жуков", "Дмитрий");

        return people;
    }

    public static int getSameFirstNameCount(Map<String, String> people) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : people.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        int count = 0;
        for (int c : firstNameCount.values()) {
            if (c > 1) {
                count += c;
            }
        }

        return count;
    }

    public static int getSameLastNameCount(Map<String, String> people) {
        Map<String, Integer> lastNameCount = new HashMap<>();
        for (String lastName : people.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int c : lastNameCount.values()) {
            if (c > 1) {
                count += c;
            }
        }

        return count;
    }
}

