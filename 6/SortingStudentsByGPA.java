import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    public void quickSort(List<Student> list, int left, int right) {
        if (left >= right) return;

        int placeMediana = getMediana(list, left, right);


        quickSort(list, left, placeMediana);
        quickSort(list, placeMediana + 1, right);
    }

    private int getMediana(List<Student> list, int left, int right) {
        return swap(list, left, right, right - 1);
    }

    private int swap(List<Student> list, int left, int right, int placeMediana) {
        Student mediana = list.get(placeMediana);
        int end = left;
        for (int i = left; i < right; i++) {
            if (end == right) return placeMediana;
            Student num = list.get(i);
            int type = compare(num, mediana);
            if (type == 1 && i < placeMediana) {
                list.add(right, num);
                list.remove(i);
                i--;
                placeMediana--;
            } else if (type == -1 && i > placeMediana) {
                list.add(left, num);
                list.remove(i + 1);
                placeMediana++;
            }
            end++;
        }
        return placeMediana;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.ball > o2.ball) return 1;
        else if (o2.ball > o1.ball) return -1;
        return 0;
    }
}
