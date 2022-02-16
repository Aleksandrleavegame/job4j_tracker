package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String colorUniform;

    public Surgeon(String name, String surname, String education, String birthday, String nameHospital, String colorUniform) {
        super(name, surname, education, birthday, nameHospital);
        this.colorUniform = colorUniform;
    }

    public boolean operation() {
        return true;
    }
}
