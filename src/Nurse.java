import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Nurse extends Human implements Summoner {

    private final Map<Drug, Integer> medkit = new HashMap<>();
    private boolean isOnDuty;
    private boolean isOnCheckout;

    public Nurse(String name, int age) {
        super(name, age);
    }

    public boolean isOnDuty() {
        return isOnDuty;
    }

    public void setOnDuty(boolean onDuty) {
        isOnDuty = onDuty;
    }

    public boolean isOnCheckout() {
        return isOnCheckout;
    }

    public void setOnCheckout(boolean onCheckout) {
        isOnCheckout = onCheckout;
    }

    public void addToMedkit(Drug drug, Integer qt) {
        String bless = "";
        medkit.putIfAbsent(drug, 0);
        medkit.putIfAbsent(drug, medkit.get(drug) + qt);
        if (drug.getDrugs().equals(Drugs.Crucify)) {
            bless = "\n***Hallelujah***\n";
        }
        System.out.println(bless + this.getName() + " quickly put " + drug.getDrugs() + " into med kit" + bless);
    }

    public void addToMedkit(Drug drug) {
        String bless = "";
        medkit.putIfAbsent(drug, 0);
        medkit.putIfAbsent(drug, medkit.get(drug) + 1);
        if (drug.getDrugs().equals(Drugs.Crucify)) {
            bless = "\n***Hallelujah***\n";
        }
        System.out.println(bless + this.getName() + " quickly put " + drug.getDrugs() + " into med kit" + bless);
    }

    public void removeFromMedkit(Drug drug, Integer qt) {
        if (medkit.containsKey(drug)) {
            if (medkit.get(drug) > qt) {
                medkit.put(drug, medkit.get(drug) - qt);
                System.out.println(this.getName() + " quickly remove " + qt
                        + " pcs of " + drug.getDrugs() + " from med kit");
            } else if (Objects.equals(medkit.get(drug), qt)) {
                medkit.remove(drug);
                System.out.println(this.getName() + " complete remove " + drug.getDrugs() + " from med kit");
            } else System.out.println(this.getName() + " is missing " + (qt - medkit.get(drug))
                    + " pcs of " + drug.getDrugs());
        }
        medkit.putIfAbsent(drug, medkit.get(drug) + qt);
        System.out.println(this.getName() + " quickly put " + drug.getDrugs() + " into med kit");
    }

    public void removeFromMedkit(Drug drug) {
        medkit.putIfAbsent(drug, 0);
        medkit.putIfAbsent(drug, medkit.get(drug) + 1);
        System.out.println(this.getName() + " quickly put " + drug.getDrugs() + " into med kit");
    }

    public void summon(CheckoutCab cab) {
        if (this.isOnCheckout) {
            Separator s = new Separator("-------------");
            List<Student> allStudent = cab.getAllStudent();
            cab.printList(allStudent);
            s.sep();
            allStudent.sort(new CompareBySeverity());
            for (Student student : allStudent) {
                if (student.getSeverity() > 0) {
                    cab.addToSummStudent(student);
                } else System.out.println(student.getName() + " is healthy as a Astronaut");
            }
            s.sep();
            System.out.println("Patient summoned in order of severity of his diseases");
            s.sep();
            cab.printList(cab.getSummonedStudents());
            s.sep();
        }

    }

}
