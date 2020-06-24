package io.rimism.study.doit.question;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q4MedianTest {
  private Q4Median median;

  @Before
  public void setUp() throws Exception {
    this.median = new Q4Median();
  }

  @Test
  public void medianTest1() {
    assertEquals(2, median.getMedian(1, 2, 3));
  }

  @Test
  public void medianTest2() {
    assertEquals(2, median.getMedian(2, 3, 1));
  }

  @Test
  public void medianTest3() {
    assertEquals(2, median.getMedian(3, 1, 2));
  }

  @Test
  public void medianTest4() {
    assertEquals(2, median.getMedian(2, 1, 3));
  }

  @Test
  public void medianTest5() {
    assertEquals(2, median.getMedian(1, 3, 2));
  }

  @Test
  public void medianTest6() {
    assertEquals(2, median.getMedian(3, 2, 1));
  }

  @Test
  public void medianTest7() {
    assertEquals(2, median.getMedian(2, 2, 1));
  }

  @Test
  public void medianTest8() {
    assertEquals(2, median.getMedian(1, 2, 2));
  }

  @Test
  public void medianTest9() {
    assertEquals(2, median.getMedian(2, 1, 2));
  }

  @Test
  public void medianTest10() {
    assertEquals(2, median.getMedian(2, 2, 3));
  }

  @Test
  public void medianTest11() {
    assertEquals(2, median.getMedian(3, 2, 2));
  }

  @Test
  public void medianTest12() {
    assertEquals(2, median.getMedian(2, 3, 2));
  }

  @Test
  public void medianTest13() {
    assertEquals(2, median.getMedian(2, 2, 2));
  }
}