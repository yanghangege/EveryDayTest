package com.example.demo.test.Day5;

/**
 * @author sun
 */
public class FunctionalInterfaceMain {
    /*java中，引入了一个新的操作符“->”，该操作符在很多资料中，称为箭头操作符，或者lambda操作符；箭头操作符将lambda分成了两个部分：
   1.   左侧：lambda表达式的参数列表
   2.   右侧：lambda表达式中所需要执行的功能，即lambda函数体
   3.lambda表达式语法格式；

   lamabd表达式中，需要有函数式接口的支持；
   函数式接口定义：接口中只有一个抽象方法的接口，称为函数式接口；
   函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
   可以使用@FunctionalInterface注解修饰，对该接口做检查；如果接口里，有多个抽象方法，使用该注解，会有语法错误
   */
    public static void main(String[] args) {
        FunctionalInterfaceTest a = message -> System.out.println("进来了" + message);
        a.sayMessage("123");
    }
}
