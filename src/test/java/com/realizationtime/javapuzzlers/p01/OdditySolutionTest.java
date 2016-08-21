package com.realizationtime.javapuzzlers.p01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.p01.OdditySolution.isOdd;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class OdditySolutionTest {

  @DataProvider(name = "odds")
  public static Object[][] odds() {
    return new Object[][]{{1}, {145}, {-1}, {-3}};
  }

  @DataProvider(name = "evens")
  public static Object[][] evens() {
    return new Object[][]{{0}, {2}, {146}, {-6}};
  }

  @Test(dataProvider = "odds")
  public void oddsAreHandledCorrectly(int n) throws Exception {
    assertTrue(isOdd(n), n + " should be odd, but it isn't");
  }

  @Test(dataProvider = "evens")
  public void evensAreHandledCorrectly(int n) throws Exception {
    assertFalse(isOdd(n), n + " should not be odd, but it is");
  }

}