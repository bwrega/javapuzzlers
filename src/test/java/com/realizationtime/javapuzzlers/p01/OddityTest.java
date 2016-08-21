package com.realizationtime.javapuzzlers.p01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.p01.Oddity.isOdd;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class OddityTest {

  @DataProvider(name = "positiveOdds")
  public static Object[][] positiveOdds() {
    return new Object[][]{{1}, {145}};
  }

  @DataProvider(name = "negativeOdds")
  public static Object[][] negativeOdds() {
    return new Object[][]{{-1}, {-45}};
  }

  @DataProvider(name = "evens")
  public static Object[][] evens() {
    return new Object[][]{{0}, {2}, {146}, {-6}};
  }

  @Test(dataProvider = "positiveOdds")
  public void positiveOddsAreHandledCorrectly(int n) throws Exception {
    assertTrue(isOdd(n));
  }

  @Test(dataProvider = "negativeOdds")
  public void negativeOddsAreHandledWrong(int n) throws Exception {
    assertFalse(isOdd(n));
  }

  @Test(dataProvider = "evens")
  public void evensAreHandledCorrectly(int n) throws Exception {
    assertFalse(isOdd(n));
  }

}