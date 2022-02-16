package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(
                first,
                max(second, third)
        );
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(
                first,
                max(second, third, fourth)
        );
    }

    public static void main(String[] args) {
        int result = Max.max(1000, 50);
        System.out.println(result);
        result = Max.max(10, 20, 30);
        System.out.println(result);
        result = Max.max(5, 10, 15, 20);
        System.out.println(result);
    }
}
