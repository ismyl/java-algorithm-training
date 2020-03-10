package io.rimism.study.codewars.java7kyu;

/**
 * @apiNote https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
 * @since 2020.03.10
 * */
public class SquareEveryDigit {

    public int squareDigits(int n) {

        String target = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            int intSq = (int) Math.pow(Integer.parseInt(String.valueOf(target.charAt(i))), 2);
            sb.append(intSq);
        }

        return Integer.parseInt(sb.toString());
    }

    public int squareDigits_BEST_PRACTICE(int n) {
        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }
}
