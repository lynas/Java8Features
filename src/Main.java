import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new StudentManager().getStudents();
        Double highscore = (Double) students.stream()
                .filter(s -> s.getYear() == 2011)
                .map(s -> s.getScore())
                .max(Double::compare)
                .get();
        System.out.println(highscore);
    }
}
