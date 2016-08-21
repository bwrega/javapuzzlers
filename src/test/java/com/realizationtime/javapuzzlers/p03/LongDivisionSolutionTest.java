package com.realizationtime.javapuzzlers.p03;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LongDivisionSolutionTest {

  @Test
  public void dividesCorrectly() throws Exception {
    assertEquals(LongDivisionSolution.longDivide(), 1000L);
  }

}