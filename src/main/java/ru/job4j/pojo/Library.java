package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book redBook = new Book("RED BOOK", 333);
        Book blackBook = new Book("Bible", 555);
        Book greenBook = new Book("Trees", 777);
        Book whiteBook = new Book("Clean code", 0);

        Book[] books = new Book[4];
        books[0] = redBook;
        books[1] = blackBook;
        books[2] = greenBook;
        books[3] = whiteBook;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPageCount());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPageCount());
        }

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPageCount());
            }
        }
    }
}
