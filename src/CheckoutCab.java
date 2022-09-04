import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CheckoutCab {
    int cabNumber;
    private final List<Student> allStudent = new ArrayList<>();
    private final List<Student> summonedStudents = new ArrayList<>();

    public CheckoutCab(int cabNumber) {
        this.cabNumber = cabNumber;
    }

    public int getCabNumber() {
        return cabNumber;
    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public List<Student> getSummonedStudents() {
        return summonedStudents;
    }

    public void addStudentToCheck(Student student) {
        if (!allStudent.contains(student)) {
            this.allStudent.add(student);
            System.out.println(student.getName() + " registered");
        } else System.out.println(student.getName() + " already registered");
    }

    public void addToSummStudent(Student student) {
        if (!summonedStudents.contains(student)) {
            this.summonedStudents.add(student);
            System.out.println(student.getName() + " summoned on the checkout");
        } else System.out.println(student.getName() + " already summoned on the checkout");
    }

    public void setNurse(Nurse nurse) {
        if (!nurse.isOnCheckout()) {
            nurse.setOnCheckout(true);
            System.out.println(nurse.getName() + " slowly walk in checkout cabinet n. " + this.getCabNumber());
        } else System.out.println(nurse.getName() + " is already on this boring duty");
    }

    public void printList (List<Student> list) {
        int count = 1;
        for (Student student : list) {
            System.out.println(count++ + ". " + student.getName());
        }
    }


}
