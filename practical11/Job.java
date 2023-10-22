package practical11;

import java.time.*;
import java.util.*;

class Task {
    String name, varTask;
    Calendar dateOutTask, dateGetTask;
    LocalTime timeGetTask;
    Date timeOutTask;

    public Task(String name, String varTask, Calendar dateGetTask, Calendar dateOutTask, LocalTime timeGetTask, Date timeOutTask) {
        this.name = name;
        this.varTask = varTask;
        this.dateGetTask = dateGetTask;
        this.dateOutTask = dateOutTask;
        this.timeGetTask = timeGetTask;
        this.timeOutTask = timeOutTask;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", varWork='" + varTask + '\'' +
                ", dateOutWork=" + dateOutTask.getTime() +
                ", dateGetWork=" + dateGetTask.getTime() +
                ", timeGetWork=" + timeGetTask +
                ", timeOutWork=" + timeOutTask.getHours() +
                '}';
    }
}

public class Job {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Введите имя: "); String name = src.next();
        System.out.println("Введите работу: "); String work = src.next();
        System.out.println("Введите время дедлайна: "); Date timeDeadline = new Date(src.nextInt());
        System.out.println("Введите год: "); int year = src.nextInt();
        System.out.println("Введите месяц: "); int month = src.nextInt()-1;
        System.out.println("Введите день: "); int day = src.nextInt();
        Calendar dateDeadline = new GregorianCalendar(year, month, day);
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        Calendar calendar = Calendar.getInstance();
        calendar.set(currentDate.getYear(), currentDate.getMonthValue() - 1, currentDate.getDayOfMonth());
        java.time.LocalTime currentTime = java.time.LocalTime.now();
        Task result = new Task(name, work, calendar, dateDeadline, currentTime, timeDeadline);
        System.out.println("У вас есть работа: " + result);
    }
}
