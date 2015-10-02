/**
 * Created by sazzad on 10/2/15.
 */
public class Student {
    private int year;
    private double score;

    public Student() {
    }

    public Student(int year, double score) {
        this.year = year;
        this.score = score;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
