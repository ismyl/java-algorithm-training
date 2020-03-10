package io.rimism.study.codewars.java7kyu;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @apiNote https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/solutions/java
 * @since 2020.03.10
 * */
public class ShortestWord {

    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .sorted((o1, o2) -> o1.length() - o2.length())
                .collect(Collectors.toList())
                .get(0).length();
    }

    public static int findShort_BEST_PRACTICE(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
