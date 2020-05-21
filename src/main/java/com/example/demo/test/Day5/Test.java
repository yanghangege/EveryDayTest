//package com.example.demo.test.Day5;
//
//import lombok.Data;
//
//import java.util.*;
//import java.util.function.BinaryOperator;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//import static java.util.function.Function.identity;
//import static java.util.stream.Collectors.*;
//
///**
// * @author sun
// */
//public class Test {
//
//
//    /*java中，引入了一个新的操作符“->”，该操作符在很多资料中，称为箭头操作符，或者lambda操作符；箭头操作符将lambda分成了两个部分：
//    1.   左侧：lambda表达式的参数列表
//    2.   右侧：lambda表达式中所需要执行的功能，即lambda函数体
//    3.lambda表达式语法格式；
//
//    lamabd表达式中，需要有函数式接口的支持；
//    函数式接口定义：接口中只有一个抽象方法的接口，称为函数式接口；
//    函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
//    可以使用@FunctionalInterface注解修饰，对该接口做检查；如果接口里，有多个抽象方法，使用该注解，会有语法错误
//    */
//
///*    流是java API中的新的成员，它可以让你用声明式的方式处理集合，简单点说，可以看成遍历数据的一个高级点的迭代器，
//    也可以看做一个工厂，数据处理的工厂，当然，流还天然的支持并行操作；也就不用去写复杂的多线程的代码*/
//
//
//    public void main(String[] args) {
//
///*
//        List<PondFarming> list = new ArrayList<>();
//
//        PondFarming pondFarming = null;
//
//        Optional.ofNullable(pondFarming).orElse(pondFarming = new PondFarming());
//
//        Optional.ofNullable(list).map(pondFarmings -> pondFarmings.get(0)).ifPresent(p -> {
//            System.out.println(p);
//        });
//
//
//        Optional.ofNullable(pondFarming).map(PondFarming::getId).ifPresent(p -> {
//            System.out.println(p);
//        });
//
//
//        Optional.ofNullable(pondFarming)
//                .filter(one -> one.getId() != 1)
//                .ifPresent(pond -> {
//                    System.out.println(pond.getId());
//                });*/
//
//
//        //flatMap 把 input Stream 中的层级结构扁平化，就是将最底层元素抽出来放到一起，最终 output 的新 Stream 里面已经没有 List 了，都是直接的数字.
//      /* List<Integer> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        List<String> list3 = new ArrayList<>();
//        List<User> list4 = new ArrayList<>();
//        List<User> list5 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list2.add("aa");
//        list2.add("bb");
//        list2.add("cc");
//        list3.add("a");
//        list3.add("b");
//        list3.add("c");
//        list4.add(new User(1, "小红a"));
//        list4.add(new User(2, "小明a"));
//        list5.add(new User(3, "小红B"));
//        list5.add(new User(4, "小明B"));
//        //1。将三个list合为一个
//        List<Object> collect = Stream.of(list1, list2, list3).flatMap(s -> s.stream()).collect(Collectors.toList());
//        System.out.println(collect.toString());
//        //2.将两个List<Integer>合2为一
//        List<String> list = Stream.of(list2, list3).flatMap(s -> s.stream()).collect(Collectors.toList());
//        System.out.println(list.toString());
//        //3.获取两个List<User>中得所有名字name集合
//        List<String> collect1 = Stream.of(list4, list5).flatMap(s -> s.stream().map(User::getName)).collect(Collectors.toList());
//        System.out.println(collect1.toString());
//*/
//        /*输出结果：
//        [1, 2, 3, aa, bb, cc, a, b, c]
//        [aa, bb, cc, a, b, c]
//        [小红a, 小明a, 小红B, 小明B]*/
//
//        /*// 将集合中的字符串中单词提取出来，不考虑特殊字符
//        List<String> words = Arrays.asList("hello c++", "hello java", "hello python");
//        List result = words.stream()
//                // 将单词按照空格切合，返回Stream类型的数据，此时获取到的是三个String[]数组
//                .map(word -> word.split(" "))
//                // 将Stream转换为Stream
//                *//*.flatMap(Arrays::stream)*//*
//                .flatMap(p -> Arrays.stream(p))
//                // 去重
//                .distinct().collect(Collectors.toList());
//        System.out.println(result);
//        //输出结果如下：[hello, c++, java, python]*/
//
//        //map与flatMap用法
//        List<Long> fishIds = salvageFishList.stream().map(SalvageFish::getId).collect(Collectors.toList());
//
//        List<SalvageFIshDetail> detailList = fishIds.stream()
//                .flatMap(fishId ->
//                        salvageFIshDetailService.selectList(new EntityWrapper<SalvageFIshDetail>()
//                                .eq("SALVAGE_FISH_ID", fishId)).stream()
//                ).collect(Collectors.toList());
//
//        List<SalvageFIshDetail> detailList2 = fishIds.stream().map(fishId ->
//                salvageFIshDetailService.selectOne(new EntityWrapper<SalvageFIshDetail>().eq("SALVAGE_FISH_ID", fishId))
//        ).collect(Collectors.toList());
//
//        List<SalvageFIshDetail> detailList3 = fishIds.stream().map(fishId ->
//                {
//                    SalvageFIshDetail salvageFIshDetail = salvageFIshDetailService.selectOne(new EntityWrapper<SalvageFIshDetail>().eq("SALVAGE_FISH_ID", fishId));
//                    salvageFIshDetail.setDeleted(Boolean.FALSE);
//                    return salvageFIshDetail;
//                }
//        ).collect(Collectors.toList());
//
//        //skip()跳过前n个元素，limit截取前n个元素
//        /*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//        list.stream().skip(10).forEach(integer -> System.out.println("integer = " + integer));
//        System.out.println("----");
//        list.stream().limit(10).forEach(integer -> System.out.println("integer = " + integer));*/
//
//        // sorted()排序
///*        List<User> list = new ArrayList<User>();
//        list.add(new User(2, "Suresh"));
//        list.add(new User(1, "Mahesh"));
//        list.add(new User(3, "Nilesh"));
//        //正序
//        list = list.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
//        list.stream().findFirst().ifPresent(p -> System.out.println(p.getName()));
//        //反序
//        list = list.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
//        list.stream().findFirst().ifPresent(p -> System.out.println(p.getName()));*/
//
//        /*anyMatch表示，判断的条件里，任意一个元素成功，返回true
//        allMatch表示，判断条件里的元素，所有的都是，返回true
//        noneMatch跟allMatch相反，判断条件里的元素，所有的都不是，返回true*/
///*        List<String> strs = Arrays.asList("a", "a", "a", "a", "b");
//        boolean aa = strs.stream().anyMatch(str -> str.equals("a"));
//        boolean bb = strs.stream().allMatch(str -> str.equals("a"));
//        boolean cc = strs.stream().noneMatch(str -> str.equals("a"));
//        long count = strs.stream().filter(str -> str.equals("a")).count();
//        System.out.println(aa);// TRUE
//        System.out.println(bb);// FALSE
//        System.out.println(cc);// FALSE
//        System.out.println(count);// 4*/
//
//
//        //min max findFirst findAny
//        // p ->p == Function.identity() 返回自己
//   /*     List<String> strs = Arrays.asList("d", "b", "a", "c", "a");
//        Optional<String> min = strs.stream().min(Comparator.comparing(Function.identity()));
//        Optional<String> max = strs.stream().max((o1, o2) -> o1.compareTo(o2));
//        System.out.println(String.format("min:%s; max:%s", min.get(), max.get()));// min:a; max:d
//
//        //在串行的流中，findAny和findFirst返回的，都是第一个对象；而在并行的流中，findAny返回的是最快处理完的那个线程的数据
//        Optional<String> aa = strs.stream().filter(str -> !str.equals("a")).findFirst();
//        Optional<String> bb = strs.stream().filter(str -> !str.equals("a")).findAny();
//
//        //并行流parallelStream
//        Optional<String> aa1 = strs.parallelStream().filter(str -> !str.equals("a")).findFirst();
//        Optional<String> bb1 = strs.parallelStream().filter(str -> !str.equals("a")).findAny();
//
//        System.out.println(aa.get() + "===" + bb.get());// d===d
//        System.out.println(aa1.get() + "===" + bb1.get());// d===b or d===c
//
//         Optional<User> mostCalorieDish = list.stream().max(Comparator.comparingInt(User::getAge));
//        Optional<User> minCalorieDish = list.stream().min(Comparator.comparingInt(User::getAge));
//        Double avgCalories = list.stream().collect(Collectors.averagingInt(User::getAge));
//        System.out.println(mostCalorieDish.get().getName()+"-"+minCalorieDish.get()+"-"+avgCalories);
//
//
//        IntSummaryStatistics summaryStatistics = list.stream().collect(Collectors.summarizingInt(User::getAge));
//        double average = summaryStatistics.getAverage();
//        long count = summaryStatistics.getCount();
//        int max = summaryStatistics.getMax();
//        int min = summaryStatistics.getMin();
//        long sum = summaryStatistics.getSum();
//        System.out.println(average+"-"+count+"-"+max+"-"+min+"-"+sum);
//        */
//
//        //collect
//        List<User> list = new ArrayList<User>();
//        list.add(new User(2, "Suresh"));
//        list.add(new User(1, "Mahesh"));
//        list.add(new User(1, "Mahesh2"));
//        list.add(new User(3, "Nilesh"));
//        //连接
//        String names = list.stream().map(User::getName).collect(Collectors.joining(","));
//        System.out.println(names);
//        //将原来的Stream映射为一个单元素流，然后收集为List。
//        List<String> nameList = list.stream().map(User::getName).collect(toList());
//        //toSet
//        Set<String> nameSet = list.stream().map(User::getName).collect(Collectors.toSet());
//        //toMap
//        Map<String, User> nameMap = list.stream().collect(toMap(User::getName, identity()));
//        for (String key : nameMap.keySet()) {
//            System.out.println("map.get(" + key + ") = " + nameMap.get(key));
//        }
//        //分组
//        Map<Integer, List<User>> detailMap = list.stream().collect(Collectors.groupingBy(User::getAge));
//        detailMap.forEach((k, v) -> {
//            System.out.println(k);
//            System.out.println(v);
//        });
//
//        //等价 select count(*) from table A group by age
//        Map<Integer, Long> typesCount = list.stream().collect(groupingBy(User::getAge, counting()));
//        //等价 select MAX(age) from table A group by Type
//        Map<Integer, Optional<User>> mostCaloricByType = list.stream()
//                .collect(groupingBy(User::getAge, maxBy(Comparator.comparingInt(User::getAge))));
//        Map<Integer, User> mostCaloricByType2 = list.stream()
//                .collect(toMap(User::getAge, Function.identity(),
//                        BinaryOperator.maxBy(Comparator.comparingInt(User::getAge))));
//        //等价 select sum(age) from table a group by name
//        Map<String, Integer> totalCaloriesByType = list.stream()
//                .collect(groupingBy(User::getName, summingInt(User::getAge)));
//
//        //分区
//        Map<Boolean, List<User>> partitionedMenu = list.stream().collect(partitioningBy(p -> {
//            return p.getAge() > 18 ? Boolean.TRUE : Boolean.FALSE;
//        }));
//        //找出1-100的质数
//        // rangeClosed等价[1,20] 转回对象流：boxed
//        Map<Boolean, List<Integer>> partitionPrimes = IntStream.rangeClosed(2, 100).boxed()
//                .collect(partitioningBy(this::isPrime));
//
//        //reducing 求和
//        Integer totalCalories = list.stream().collect(reducing(0, User::getAge, (i, j) -> i + j));
//        //使用内置函数代替箭头函数
//        Integer totalCalories2 = list.stream().collect(reducing(0, User::getAge, Integer::sum));
//        Optional<Integer> totalCalories3 = list.stream().map(User::getAge).reduce(Integer::sum);
//        //下面效率最快
//        int sum = list.stream().mapToInt(User::getAge).sum();
//
//        //reducing除了接收一个初始值，还可以把第一项当作初始值(此处返回最大的,有点类似三元表达式)
//        Optional<User> mostCalorieDish = list.stream()
//                .collect(reducing((d1, d2) -> d1.getAge() > d2.getAge() ? d1 : d2));
//        System.out.println(mostCalorieDish.get().getName());
//
//
//    }
//
//    private boolean isPrime(int candidate) {
//        int candidateRoot = (int) Math.sqrt((double) candidate);
//        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
//    }
//
//
//    public static List<Integer> buildList(final int size) {
//        List<Integer> list = new ArrayList<>(size);
//        for (int i = 1; i <= size; i++) {
//            list.add(i);
//        }
//        return list;
//    }
//
//    //与上面方法结果一样
//    public static List<Integer> buildIterate(final int size) {
//        return Stream.iterate(1, x -> ++x).limit(size).collect(Collectors.toList());
//    }
//
//}
//
//@Data
//class User {
//    private Integer age;
//    private String name;
//
//    User(Integer age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//}
//
