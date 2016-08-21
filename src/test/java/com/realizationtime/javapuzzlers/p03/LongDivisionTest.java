package com.realizationtime.javapuzzlers.p03;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.p03.LongDivision.longDivide;
import static org.testng.Assert.assertTrue;

public class LongDivisionTest {

  @Test
  public void divisionOverflows() throws Exception {
    assertTrue(longDivide() < 100L);
  }

}