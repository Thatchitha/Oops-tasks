package org.example;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("101", "Clean Code", "Robert Martin"));
        lib.addBook(new Book("102", "Effective Java", "Joshua Bloch"));


        lib.registerPatron(new Patron("P1", "Babu"));
        lib.registerPatron(new Patron("P2", "Divya"));

        lib.borrowBook("101", "P1");

        System.out.println("Return book");
        lib.returnBook("101");
        System.out.println("Search by title:");
        for (Book b : lib.searchByTitle("Java")) {
            System.out.println(b.getTitle() + " : " + b.getAuthor());
        }

        System.out.println("Search by author");
        for (Book b : lib.searchByAuthor("Robert")) {
            System.out.println(b.getTitle() + " : " + b.getAuthor());
        }
    }
}