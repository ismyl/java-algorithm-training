package io.rimism.study.codewars.java6kyu;

import java.util.stream.IntStream;

/**
 * @apiNote https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 * @since 2020.03.10
 * */
public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }

    public static String createPhoneNumber_BEST_PRACTICE(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }
}
