package com.example.demo.test.Day7;

import lombok.Data;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class test3 {


}

class menu{
    List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800),
            new Dish("beef", false, 700),
            new Dish("chicken", false, 400),
            new Dish("french fries", true, 530),
            new Dish("rice", true, 350),
            new Dish("season fruit", true, 120),
            new Dish("pizza", true, 550),
            new Dish("prawns", false, 300),
            new Dish("salmon", false, 450) );
}
@Data
class Dish{
        private final String name;
        private final boolean vegetarian;
        private final int calories;

}
