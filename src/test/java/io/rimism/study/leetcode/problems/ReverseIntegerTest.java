package io.rimism.study.leetcode.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

  ReverseInteger reverseInteger;

  @Before
  public void init() {
    this.reverseInteger = new ReverseInteger();
  }

  @Test
  public void 정수반전_123() {
    assertEquals(321, reverseInteger.reverse(123));
  }

  @Test
  public void 정수반전_7321756() {
    assertEquals(6571237, reverseInteger.reverse(7321756));
  }

  @Test
  public void 정수반전_m578912() {
    assertEquals(-219875, reverseInteger.reverse(-578912));
  }

  @Test
  public void 정수반전_overflow() {
    assertEquals(0, reverseInteger.reverse(1248956039));
  }

  @Test
  public void 정수반전_0() {
    assertEquals(0, reverseInteger.reverse(0));
  }

}