package com.realizationtime.javapuzzlers.chapter01.p03;

public class LongDivision {

  public static long longDivide() {
    final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
    final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
    return MICROS_PER_DAY / MILLIS_PER_DAY;
  }

}