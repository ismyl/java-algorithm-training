package io.rimism.study.leetcode.problems;

public class ReverseInteger {
  public int reverse(int x) {

    /* String reverse로 풀이를 작성하였으나 반전한 숫자가 int의 범위를 넘어가는 경우 Runtime Error 발생 (ex : 9646324351)
    StringBuilder reverseString = new StringBuilder();
    if (x < 0) {
      reverseString.append("-");
    }
    char[] charArray = Integer.toString(x).toCharArray();
    for (int i = charArray.length; i > 0; i--) {
      if (charArray[i - 1] != '-') {
        reverseString.append(charArray[i - 1]);
      }
    }
    return Integer.parseInt(reverseString.toString());
     */

    /* best solution
    * 대상값의 10의 나머지를 구하여 rev의 자릿수를 만든후 대상 값을 10으로 나눠 연속적으로 다음 수를 구한다.
    * Integer의 MAX, MIN 범위를 벗어나는지 예외 처리
    *  */
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
      if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
      rev = rev * 10 + pop;
    }
    return rev;
  }
}
