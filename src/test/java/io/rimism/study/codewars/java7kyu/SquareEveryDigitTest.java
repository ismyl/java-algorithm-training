package io.rimism.study.codewars.java7kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareEveryDigitTest {

    @Test
    public void test() {
        assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
    }

}