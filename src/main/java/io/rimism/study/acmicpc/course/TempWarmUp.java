package io.rimism.study.acmicpc.course;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TempWarmUp {

  public static void main(String[] args) {

  }

  public void compareTwoNumber() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String[] values = String.valueOf(br.readLine()).split(" ");
      int a = Integer.parseInt(values[0]);
      int b = Integer.parseInt(values[1]);

      if (a > b) {
        System.out.println(">");
      } else if (a < b) {
        System.out.println("<");
      } else {
        System.out.println("==");
      }
      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void testGrade() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int score = Integer.parseInt(br.readLine());

      if (score < 60) {
        System.out.println("F");
      } else if(score < 70) {
        System.out.println("D");
      } else if(score < 80) {
        System.out.println("C");
      } else if(score < 90) {
        System.out.println("B");
      } else {
        System.out.println("A");
      }

      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void checkLeapYear() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int year = Integer.parseInt(br.readLine());

      System.out.println((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0) ? "1" : "0");

      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void checkQuadrant() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int number1 = Integer.parseInt(br.readLine());
      int number2 = Integer.parseInt(br.readLine());

      if (number1 > 0) {
        System.out.println(number2 > 0 ? "1" : "4");
      } else {
        System.out.println(number2 > 0 ? "2" : "3");
      }

      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void alarmClock() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String[] values = String.valueOf(br.readLine()).split(" ");
      int hour = Integer.parseInt(values[0]);
      int minute = Integer.parseInt(values[1]);

      int minusMinute = 45;

      if (minute >= minusMinute) {
        System.out.println(hour + " " + (minute - minusMinute));
      } else {
        hour = hour == 0 ? 23 : hour - 1;
        System.out.println(hour + " " + (60 - (minusMinute - minute)));
      }

      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
