import java.util.List;

public class SortingStudentsByGPA implements Comparator {

    @Override
    public Student[] compare(Student x, Student y) {
        return x.compareTo(y);
    }

}
