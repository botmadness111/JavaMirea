package Prac6;

public class Student implements Comparable<Student> {
    int idNumber = 0;
    int ball = 0;

    Student(int idNumber) {
        this.idNumber = idNumber;
    }

    Student(int idNumber, int ball) {
        this.idNumber = idNumber;
        this.ball = ball;
    }

    @Override
    public int compareTo(Student o) {
        if (this.ball > o.ball) return 1;
        else if (this.ball < o.ball) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return this.ball + "";
    }
}
