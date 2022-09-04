public class Disease {

    private Diseases diseases;
    private int severity;

    public Disease(Diseases diseases, int severity) {
        this.diseases = diseases;
        this.severity = severity;
    }

    public Diseases getDiseases() {
        return diseases;
    }

    public void setDiseases(Diseases diseases) {
        this.diseases = diseases;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}
