package practical11;

import java.util.Scanner;

import java.time.LocalDate;

import java.time.Period;

public class Second {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalDate now = LocalDate.now();

        System.out.print("Введите год: ");

        int a = scanner.nextInt();

        System.out.print("Введите месяц: ");

        int b = scanner.nextInt();

        System.out.print("Введите день: ");

        int c = scanner.nextInt();

        LocalDate deadline = LocalDate.of(a, b, c);

        if (now.isAfter(deadline)) {

            Period period = Period.between(deadline, now);

            System.out.println(period);

        } else if (now.getDayOfMonth() == deadline.getDayOfMonth() && now.getMonthValue() == deadline.getMonthValue() && now.getYear() == deadline.getYear()) {

            System.out.println("Сегодня этот день");

        } else {

            Period period = Period.between(now, deadline);

            System.out.println("Осталось " + period.getDays() + " дней");

        }

    }

}
