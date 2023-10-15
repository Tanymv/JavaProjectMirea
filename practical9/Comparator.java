package practical9;
import java.util.ArrayList;

import java.util.Collections;
public interface Comparator {

    void quickSort (ArrayList<Student> Student, int leftBorder, int rightBorder);

    ArrayList<Student> getStudent();

}

class SortingStudentsByGPA implements Comparator{

    private final ArrayList<Student> Student;

    public SortingStudentsByGPA(ArrayList<Student> Student) {

        this.Student = Student;

    }

    @Override

    public ArrayList<Student> getStudent() {

        return Student;

    }

    @Override

    public void quickSort(ArrayList<Student> Student, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;

        int rightMarker = rightBorder;

        int pivot = Student.get((leftMarker + rightMarker) / 2).getPoints();

        do {

            while (Student.get(leftMarker).getPoints() < pivot){

                leftMarker++;

            }

            while (Student.get(rightMarker).getPoints() > pivot) {

                rightMarker--;

            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {

                    Student tmp = Student.get(leftMarker);

                    Student.set(leftMarker, Student.get(rightMarker));

                    Student.set(rightMarker,tmp);

                }

                leftMarker++;

                rightMarker--;

            }

        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {

            quickSort(Student, leftMarker, rightBorder);

        }

        if (leftBorder < rightMarker) {

            quickSort(Student, leftBorder, rightMarker);

        }

    }

    @Override

    public String toString() {

        return "SortingStudentsByGPA{" +

                "Student=" + Student +

                '}';

    }

}

class TestComparator{

    public static void main(String[] args) {

        Student a = new Student("Sofia", "Sorcova", 218, 50);

        Student b = new Student("Tania", "Mak", 213, 99);

        Student c = new Student("Daria", "Prima", 214,67);

        Student d = new Student("Ivan", "Zukanina", 215, 36);

        ArrayList<Student> mStudents = new ArrayList<>();

        mStudents.add(a);

        mStudents.add(b);

        mStudents.add(c);

        mStudents.add(d);

        Comparator iDNumber = new SortingStudentsByGPA(mStudents);

        for (Student x : iDNumber.getStudent()){

            System.out.println(x);

        }

        iDNumber.quickSort(iDNumber.getStudent(), 0, iDNumber.getStudent().size()-1);

        Collections.reverse(iDNumber.getStudent());System.out.println();

        for (Student x : iDNumber.getStudent()){

            System.out.println(x);

        }

    }

}