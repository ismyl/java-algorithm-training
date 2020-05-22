package io.rimism.study.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Easy
 * [질문]
 * Given an array of integers, return indices of the two numbers such that they add up to a
 * specific target. You may assume that each input would have exactly one solution, and you may not
 * use the same element twice.
 *
 * [예제]
 * <p>Given nums = [2, 7, 11, 15], target = 9,
 * <p>Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum1 {
  // 제출 solution
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      int target1 = nums[i];
      for (int j = 0; j < nums.length; j++) {
        if (i != j && target1 + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {};
  }

  // Best Solution - One pass Hash Table
  public int[] twoSumHashTable(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
