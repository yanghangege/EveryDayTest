package com.example.demo.test.Day8;

import com.example.demo.test.Day8.entity.Books;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class testService {
    public static void main(String[] args) {
        List<Books> bookList = new ArrayList<Books>();

        Books books = new Books();
        Books books1 = new Books();
        Books books2 = new Books();

        books.setName("The Fellowship of the Ring");
        books.setReleaseYear(1954);
        books.setIsbn("0395489318");

        books1.setReleaseYear(1954);
        books1.setName("The Two Towers");
        books1.setIsbn("0345339711");

        books2.setReleaseYear(1955);
        books2.setName("The Return of the King");
        books2.setIsbn("0618129111");

        bookList.add(books);
        bookList.add(books1);
        bookList.add(books2);
    }

    public static Map<String, String> listToMap(List<Books> books) {
        return books.stream().collect(Collectors.toMap(Books::getIsbn, Books::getName));
    }


}
