package Prac6;

import java.util.*;

public class Test {
    public static void main(String[] agrs) {

        List<Student> students = new ArrayList<>(Arrays.asList(new Student(5), new Student(2), new Student(1), new Student(8)));
        students = sortStudents(students);
        for (Student student : students) {
            System.out.printf(student.idNumber + " ");
        }

        System.out.println("\n ");

        // --------2--------
        students = new ArrayList<>(Arrays.asList(new Student(5, 2), new Student(2, 5), new Student(1, 3), new Student(8, 2)));
        SortingStudentsByGPA sortingStudent = new SortingStudentsByGPA();
        sortingStudent.quickSort(students, 0, students.size());
        System.out.println(students);

        // --------3--------
        students = new ArrayList<>(Arrays.asList(new Student(5, 2), new Student(2, 5), new Student(1, 3), new Student(8, 2)));
        students = sortingStudent.mergeSort(students);
        System.out.println(students);
    }

    private static List<Student> sortStudents(List<Student> students) {
        Student[] sortedStudents = new Student[students.size()];
        for (Student student : students) {
            if (sortedStudents[0] == null) {
                sortedStudents[0] = student;
                continue;
            }
            for (int i = 0; i < sortedStudents.length; i++) {
                Student object = sortedStudents[i];
                if (object == null) {
                    sortedStudents[i] = student;
                    break;
                }
                if (student.idNumber < object.idNumber) {
                    //смещение
                    for (int right = students.size() - 1; right != i; right--) {
                        sortedStudents[right] = sortedStudents[right - 1];
                    }
                    sortedStudents[i] = student;
                    break;
                }
            }
        }
        students.clear();
        Collections.addAll(students, sortedStudents);
        return students;
//        for (Student student : sortedStudents) {
//            System.out.printf(student.idNumber + " ");
//        }
//        System.out.println("\n");

    }
}
