package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int coast;

    public Dentist(String name, String surname, String education, String birthday, String nameHospital, int coast) {
        super(name, surname, education, birthday, nameHospital);
        this.coast = coast;
    }

    public boolean toothExtraction() {
        return true;
    }
}
