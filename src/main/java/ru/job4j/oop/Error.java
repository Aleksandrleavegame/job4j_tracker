package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printinfo() {
        System.out.println("Активность " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printinfo();
        Error error1 = new Error(true, 1, "Код работает");
        error1.printinfo();
        Error error2 = new Error(false, 351, "Job4j");
        error2.printinfo();
    }
}
