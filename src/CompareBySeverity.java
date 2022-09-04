import java.util.Comparator;

public class CompareBySeverity implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getSeverity() - o1.getSeverity();
    }
}
