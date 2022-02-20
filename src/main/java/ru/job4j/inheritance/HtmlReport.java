package ru.job4j.inheritance;

public class HtmlReport extends TextReport {

    public String generate(String name, String body) {
        return "<h11>" + name + "</h1>" + "<br/>" + "<span>" + body + "</span>";
    }
}
