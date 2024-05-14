package org.example.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeJavaInt8 {

    static List<Integer> integerList = Arrays.asList(20,300,4,10,20,30,13,43,13);

    public static void main(String[] args) {
        //filter collector tolist
        List<Integer> oddList = integerList.stream().filter(n -> n%2!=0).collect(Collectors.toList());
        oddList.forEach(System.out::println);
        System.out.println("-----------------------");
        //filter collector toset
        Set<Integer> oddSet = integerList.stream().filter(n -> n%2!=0).collect(Collectors.toSet());
        oddSet.forEach(System.out::println);

        //remove duplicate
        System.out.println("-----------remove duplicate------------");
        integerList.stream().distinct().forEach(System.out::println);

        //show duplicate
        Set<Integer> duplicateSet = new HashSet<>();
        System.out.println("-----------show duplicate------------");
        integerList.stream().filter(n -> !duplicateSet.add(n)).forEach(System.out::println);

        //find max
        System.out.println("-----------find max------------");
        int max = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        //find min
        System.out.println("-----------find min------------");
        int min = integerList.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

        //find max 3
        System.out.println("-----------find max 3------------");
        integerList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        //find min 3
        System.out.println("-----------find min 3------------");
        integerList.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);

        //second largest number
        System.out.println("-----------second largest number------------");
        int secondLarge = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLarge);

        //reduce sum
        Integer sum = oddList.stream()
                .reduce(0, Integer::sum);
        System.out.println("---------sum of oddlist--------------");
        System.out.println(sum);
        Integer sum1 = oddSet.stream().reduce(0,Integer::sum);
        System.out.println("----------asum of oddset-------------");
        System.out.println(sum1);

        //tomap
        System.out.println(integerList.stream().collect(Collectors.groupingBy(n -> n>10)));
            //{4=1, 20=2, 10=1, 43=1, 300=1, 13=2, 30=1}
        System.out.println("----------frequency of ezch element in list-------------");
        System.out.println(integerList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        //sum first 10 num
        System.out.println("----------sum first 10 num-------------");
        System.out.println( IntStream.rangeClosed(1,10).sum());

        //sum of all digit of a number
        System.out.println("----------sum of all digit of a number-------------");
        int num = 98765;

        Integer sumOfDigits = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sumOfDigits);

    }
}
