package Prac6;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<Student> mergeSort(List<Student> list) {
        if (list.size() == 1) return list;

        List<Student> arrayOne = list.subList(0, list.size() / 2);
        List<Student> arrayTwo = list.subList(list.size() / 2, list.size());

        arrayOne = mergeSort(arrayOne);
        arrayTwo = mergeSort(arrayTwo);

        list = joinArrays(arrayOne, arrayTwo);
        return list;
    }

    private List<Student> joinArrays(List<Student> arrayOne, List<Student> arrayTwo) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arrayOne.size() && j < arrayTwo.size()) {
            Student stud1 = arrayOne.get(i);
            Student stud2 = arrayTwo.get(j);

            int type = compare(stud1, stud2);
            if (type == -1) {
                result.add(stud1);
                i++;
            } else {
                result.add(stud2);
                j++;
            }

        }
        while (i != arrayOne.size()) {
            result.add(arrayOne.get(i));
            i++;
        }
        while (j != arrayTwo.size()) {
            result.add(arrayTwo.get(j));
            j++;
        }
        return result;
    }


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.ball > o2.ball) return 1;
        else if (o2.ball > o1.ball) return -1;
        return 0;
    }
}
