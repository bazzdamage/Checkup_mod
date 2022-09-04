public class Main {

    public static void main(String[] args) {

        Separator s = new Separator("-------------");

        CheckoutCab cab = new CheckoutCab(1);

        Student peter = new Student("Peter", 18);
        Student malcolm = new Student("Malcolm", 22);
        Student mahoney = new Student("Mahoney", 34);
        Student gagarin = new Student("Gagarin", 88);

        cab.addStudentToCheck(malcolm);
        cab.addStudentToCheck(mahoney);
        cab.addStudentToCheck(peter);
        cab.addStudentToCheck(gagarin);
        s.sep();

        Nurse amanda = new Nurse("Amanda", 45);
        Nurse lawanda = new Nurse("Lawanda", 18);
        Lazareth lazareth = new Lazareth("Last Hope", 2);

        Disease flu = new Disease(Diseases.Flu, 10);
        Disease covid = new Disease(Diseases.Covid, 45);
        Disease plague = new Disease(Diseases.Plague, 100);
        Disease cancer = new Disease(Diseases.Cancer, 80);
        Disease ebola = new Disease(Diseases.Ebola, 70);

        Drug teraFlu = new Drug(Drugs.TeraFlu, Diseases.Flu);
        Drug sputnik = new Drug(Drugs.Sputnik_V, Diseases.Covid);
        Drug crucify = new Drug(Drugs.Crucify, Diseases.Plague);
        Drug morphine = new Drug(Drugs.Morphine, Diseases.Cancer);
        Drug vaccine = new Drug(Drugs.Vaccine, Diseases.Ebola);

        peter.getSick(flu);
        mahoney.getSick(plague);
        mahoney.getSick(cancer);
        malcolm.getSick(covid);
        malcolm.getSick(ebola);
        malcolm.getSick(ebola);
        s.sep();

        lazareth.setNurse(amanda);
        lazareth.setNurse(amanda);
        s.sep();

        amanda.addToMedkit(teraFlu, 2);
        amanda.addToMedkit(sputnik);
        amanda.addToMedkit(crucify);
        amanda.addToMedkit(morphine);
        s.sep();

        lazareth.putInLazareth(peter);
        lazareth.putInLazareth(mahoney);
        lazareth.putInLazareth(malcolm);
        lazareth.putInLazareth(mahoney);
        s.sep();

        cab.setNurse(lawanda);
        s.sep();
        lawanda.summon(cab);
    }
}
