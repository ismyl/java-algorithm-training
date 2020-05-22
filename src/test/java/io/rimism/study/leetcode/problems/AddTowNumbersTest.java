package io.rimism.study.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTowNumbersTest {

  @Test
  public void addTwoNumbers() {
    AddTowNumbers solution = new AddTowNumbers();
    Assert.assertEquals(new AddTowNumbers.ListNode(4).val, solution.addTwoNumbers(new AddTowNumbers.ListNode(1), new AddTowNumbers.ListNode(3)).val);
  }
}