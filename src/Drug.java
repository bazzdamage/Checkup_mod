public class Drug {
    private final Drugs drugs;
    private final Diseases effect;

    public Drug(Drugs drugs, Diseases effect) {
        this.drugs = drugs;
        this.effect = effect;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public Diseases getEffect() {
        return effect;
    }
}
