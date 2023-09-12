import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] agrs) {
        List<Student> students = new ArrayList<>(Arrays.asList(new Student(5), new Student(2), new Student(1), new Student(8)));
        students = sortStudents(students);
        for (Student student : students) {
            System.out.printf(student.idNumber + " ");
        }

        // --------2--------
        students = new ArrayList<>(Arrays.asList(new Student(5, 2), new Student(2, 5), new Student(1, 3), new Student(8, 2)));


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
        students = Arrays.stream(sortedStudents).toList();
        return students;
//        for (Student student : sortedStudents) {
//            System.out.printf(student.idNumber + " ");
//        }
//        System.out.println("\n");

    }
}
