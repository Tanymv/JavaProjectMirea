package practical9;

import java.util.ArrayList;

public class Student {
    private String name;

    private String surname;

    private int group, points;

    public Student(String name, String surname, int group, int points)

    {

        this.name = name;

        this.surname = surname;

        this.group = group;

        this.points = points;

    }

    @Override

    public String toString() {

        return String.format("Name: %-12s Surname: %-15s Group: %-12d Points: %-3d",name, surname, group, points);

    }

    public int getGroup() {

        return group;

    }

    public int getPoints() {

        return points;

    }

}

class iDNumber{

    public static void selectionSort (ArrayList<Student> list) {

        for (int left = 0; left < list.size(); left++) {

// Вытаскиваем значение элемента

            Student value = list.get(left);

// Перемещаемся по элементам, которые перед вытащенным элементом

            int i = left - 1;

            for (; i >= 0; i--) {

// Если вытащили значение меньшее — передвигаем больший элемент дальше

                if (value.getGroup() < list.get(i).getGroup()) {

                    list.set(i + 1, list.get(i));

                } else {

// Если вытащенный элемент больше — останавливаемся

                    break;

                }

            }

// В освободившееся место вставляем вытащенное значение

            list.set(i + 1, value);

        }

    }

    public static void main(String[] args)

    {

        Student a = new Student("Sofia", "Sorcova", 218, 50);

        Student b = new Student("Tania", "Mak", 213, 99);

        Student c = new Student("Daria", "Prima", 214,67);

        Student d = new Student("Ivan", "Zukanina", 215, 36);

        ArrayList<Student> mStudents = new ArrayList();

        mStudents.add(a);

        mStudents.add(b);

        mStudents.add(c);

        mStudents.add(d);

        for (Student x : mStudents){

            System.out.println(x);

        }

        selectionSort(mStudents);

        for (Student x : mStudents){

            System.out.println(x);

        }

    }
}
