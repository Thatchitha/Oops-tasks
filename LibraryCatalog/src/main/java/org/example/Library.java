package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Patron> patrons = new HashMap<>();
    private Map<String, String> borrowedBy = new HashMap<>();
    public void addBook(Book book)
    {
        try{
            if(books.containsKey(book.getIsbn()))
            {
                throw new IllegalArgumentException("ISBN already exist");

            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        books.put(book.getIsbn(),book);


    }
    public void registerPatron(Patron patron)
    {
        try{
            if(books.containsKey(patron.getPatronId()))
            {
                throw new IllegalArgumentException("PatronId already exist");

            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        patrons.put(patron.getPatronId(),patron);


    }
    public void borrowBook(String isbn, String patronId)
    {
        Book book=books.get(isbn);
        if(book.isBorrowed())
        {
            throw new IllegalArgumentException("Book already borrowed");
        }
        LocalDate due=LocalDate.of(2025,10,2);
        book.setDueDate(due.toString());
        System.out.println(book.getDueDate());
        book.setBorrowed(true);
        borrowedBy.put(isbn,patronId);

    }
    public void returnBook(String isbn)
    {
        Book book=books.get(isbn);
        LocalDate dueDate = LocalDate.parse(book.getDueDate());
        System.out.println(dueDate);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        long fine = 0;
        if(today.isAfter(dueDate))
        {
            long late= ChronoUnit.DAYS.between(dueDate,today);
            System.out.println(late);
            fine=late*20;
            System.out.println("Late by "+late+ "days " +"fine:"+fine);
        }
        book.setBorrowed(false);
        book.setDueDate(null);
        borrowedBy.remove(isbn);

    }
    public List<Book> searchByAuthor(String author)
    {
        List<Book> result=new ArrayList<>();
        for(Book b: books.values())
        {
           if(b.getAuthor().contains(author))
            result.add(b);
        }
        return result;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book b : books.values()) {
            if (b.getTitle().contains(title))
                result.add(b);
        }
        return result;
    }
}
