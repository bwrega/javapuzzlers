package com.realizationtime.javapuzzlers.chapter01.p02;

import java.math.BigDecimal;

public class ChangeSolution {

  public static BigDecimal change() {
    BigDecimal twoDollars = new BigDecimal("2.00");
    BigDecimal oneDollarAndTenCents = new BigDecimal("1.10");
    return twoDollars.subtract(oneDollarAndTenCents);
  }

}