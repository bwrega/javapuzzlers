package com.realizationtime.javapuzzlers.chapter01.p03;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.chapter01.p03.LongDivision.longDivide;
import static org.assertj.core.api.Assertions.assertThat;

public class LongDivisionTest {

  @Test
  public void divisionOverflows() throws Exception {
    assertThat(longDivide() < 100L);
  }

}