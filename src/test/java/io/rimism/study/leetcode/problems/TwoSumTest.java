package io.rimism.study.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

  @Test
  public void two_sum_test() {
    int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int target = 11;

    TwoSum1 twoSum = new TwoSum1();
    Assert.assertArrayEquals(new int[]{3, 6}, twoSum.twoSum(intArr, target));
  }

}