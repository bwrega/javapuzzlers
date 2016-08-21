package com.realizationtime.javapuzzlers.chapter01.p01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.chapter01.p01.Oddity.isOdd;
import static org.assertj.core.api.Assertions.assertThat;

public class OddityTest {

  @Test(dataProvider = "positiveOdds")
  public void positiveOddsAreHandledCorrectly(int n) throws Exception {
    assertThat(isOdd(n)).isTrue();
  }

  @Test(dataProvider = "negativeOdds")
  public void negativeOddsAreHandledWrong(int n) throws Exception {
    assertThat(isOdd(n)).isFalse();
  }

  @Test(dataProvider = "evens")
  public void evensAreHandledCorrectly(int n) throws Exception {
    assertThat(isOdd(n)).isFalse();
  }

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

}