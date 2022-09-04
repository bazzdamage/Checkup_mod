import java.util.ArrayList;

public class Lazareth {
    private Nurse nurse;
    private int capacity;
    private String name;

    private final ArrayList<Student> patients = new ArrayList<>();

    public Lazareth(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        if (!nurse.isOnDuty()) {
            this.nurse = nurse;
            nurse.setOnDuty(true);
            System.out.println(nurse.getName() + " coming on duty today");
        } else System.out.println(nurse.getName() + " is already on this boring duty");
    }



    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void putInLazareth(Student student) {
        if (student.isInLazareth()) {
            System.out.println(student.getName() + ", are you blind??? your \"shkonka\" is over there");
        } else if (student.getSeverity() == 0) {
            System.out.println(student.getName() + ", get the hell out of here!!! You are completely healthy.");
        } else if (this.patients.size() == this.capacity) {
            System.out.println(student.getName()
                    + ", get the hell out of here or lie down on the floor and pray to gods");
        } else {
            patients.add(student);
            student.setInLazareth(true);
            System.out.println(student.getName() + ", welcome my dear friend, but don't cough on me!!!");
        }
    }
}
