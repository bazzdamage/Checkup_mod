import java.util.HashSet;

public class Student extends Human {
    private HashSet<Disease> curDiseases = new HashSet<>();
    boolean isInLazareth;
    boolean onCheckout;

    public Student(String name, int age) {
        super(name, age);
    }

    public HashSet<Disease> getCurDiseases() {
        return curDiseases;
    }

    public void setCurDiseases(HashSet<Disease> curDiseases) {
        this.curDiseases = curDiseases;
    }

    public boolean isInLazareth() {
        return isInLazareth;
    }

    public void setInLazareth(boolean inLazareth) {
        isInLazareth = inLazareth;
    }

    public boolean isOnCheckout() {
        return onCheckout;
    }

    public void setOnCheckout(boolean onCheckout) {
        this.onCheckout = onCheckout;
    }

    public void getSick(Disease disease) {
        if(!curDiseases.contains(disease)) {
            curDiseases.add(disease);
            int severity = this.getSeverity();
            if (severity <= 10) {
                System.out.println(this.getName() + " feeling queasy");
            } else if (severity <= 80) {
                System.out.println(this.getName() + " is feverish");
            } else {
                System.out.println(this.getName() + "'s life flashes before his eyes");
            }
        } else System.out.println(this.getName() + " condition has not changed");
    }

    public void getHealed(Disease disease) {
        curDiseases.remove(disease);
    }

    public int getSeverity() {
        int severity = 0;
        for (Disease curDisease : curDiseases) {
            severity += curDisease.getSeverity();
        }
        return severity;
    }

}
