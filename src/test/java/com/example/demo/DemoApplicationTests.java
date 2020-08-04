package com.example.demo;

import com.example.demo.test.Day8.entity.Books;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootTest
class DemoApplicationTests {


    @Test
    public void whenConvertFromListToMap() {
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

//        assertEquals(3, testService.listToMap(bookList).size());

//        Map<String, Books> collect = bookList.stream().collect(Collectors.toMap(Books::getIsbn, Function.identity()));

        //List<String> isbn =bookList.stream().map(Books::getIsbn).collect(Collectors.toList());
//        List<String> isbn = bookList.stream().map(Books::getIsbn).collect(Collectors.toList());
//        collect.forEach(e -> {
//            if (isbn.contains(e)) {
//
//            }
//        });
//        System.out.println(collect);


    }
}
