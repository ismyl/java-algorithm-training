package io.rimism.study.doit.question;

public class Q4Median {
  public int getMedian(int a, int b, int c) {
    if (a >= b) {
      if (b >= c) {
        return b;
      } else if (c >= a) {
        return a;
      } else {
        return c;
      }
    } else {
      if (c <= a) {
        return a;
      } else if (b <= c) {
        return b;
      } else {
        return c;
      }
    }
  }
}
