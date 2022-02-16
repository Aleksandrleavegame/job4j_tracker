package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String nameHospital;

    public Doctor(String name, String surname, String education, String birthday, String nameHospital) {
        super(name, surname, education, birthday);
        this.nameHospital = nameHospital;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }
}
