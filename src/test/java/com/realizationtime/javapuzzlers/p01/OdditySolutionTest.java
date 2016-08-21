package com.realizationtime.javapuzzlers.p01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.p01.OdditySolution.isOdd;
import static org.assertj.core.api.Assertions.assertThat;

public class OdditySolutionTest {

  @Test(dataProvider = "odds")
  public void oddsAreHandledCorrectly(int n) throws Exception {
    assertThat(isOdd(n)).isTrue();
  }

  @Test(dataProvider = "evens")
  public void evensAreHandledCorrectly(int n) throws Exception {
    assertThat(isOdd(n)).isFalse();
  }

  @DataProvider(name = "odds")
  public static Object[][] odds() {
    return new Object[][]{{1}, {145}, {-1}, {-3}};
  }

  @DataProvider(name = "evens")
  public static Object[][] evens() {
    return new Object[][]{{0}, {2}, {146}, {-6}};
  }

}