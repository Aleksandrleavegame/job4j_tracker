package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "\t\"nam de\" : \"" + name + "\","
                + System.lineSeparator() + "\t\"body\" : \""
                + body + "\"" + System.lineSeparator()
                + "}";
    }
}
