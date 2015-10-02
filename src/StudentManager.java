import java.util.ArrayList;
import java.util.List;

/**
 * Created by sazzad on 10/2/15.
 */
public class StudentManager {
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(2011, 599));
        students.add(new Student(2012, 599));
        students.add(new Student(2013, 599));
        students.add(new Student(2011, 199));
        students.add(new Student(2011, 299));
        students.add(new Student(2012, 599));
        students.add(new Student(2012, 599));
        students.add(new Student(2011, 399));
        students.add(new Student(2011, 499));
        students.add(new Student(2015, 599));
        students.add(new Student(2011, 599));
        students.add(new Student(2015, 599));
        students.add(new Student(2011, 699));
        students.add(new Student(2011, 399));
        students.add(new Student(2011, 399));
        students.add(new Student(2015, 599));
        students.add(new Student(2015, 599));

        return students;
    }
}
