package org.example.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeJavaStr8 {

    static String str = "Practice Java 8 Programming";
    static List<String> listOfStrings = Arrays.asList("GenAI", "Copilot", "ChatGPT", "AWS", "SpringCloud");

    public static void main(String[] args) {
        //frequency of each char
        System.out.println("-----------frequency of each char in string------------");
        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        //join prefix suffix delimiter
        System.out.println("-----------join prefix suffix delimiter------------");
        System.out.println(listOfStrings.stream().collect(Collectors.joining(",","[","]")));

        //sort based on length
        System.out.println("-----------sort based on length------------");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        //reverse each word of string
        System.out.println("-----------reverse each word of string------------");
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reversedStr);

        //first non-repeated char
        System.out.println("-----------first non-repeated char------------");
        Map<String, Long> map1 =
                Arrays.stream(str.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String nonRepeatChar = map1.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println(nonRepeatChar);

    }
}
