package ru.job4j.inheritance;

public class Builder extends Engineer {

    private boolean helmet;

    public Builder(String name, String surname, String education, String birthday, String engineeringSpecialty, boolean helmet) {
        super(name, surname, education, birthday, engineeringSpecialty);
        this.helmet = helmet;
    }

    public boolean plan() {
        return true;
    }
}
