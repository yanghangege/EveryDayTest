package com.example.demo.test.Day8.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Books {
    private String name;
    private int releaseYear;
    private String isbn;

}
