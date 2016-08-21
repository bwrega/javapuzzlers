package com.realizationtime.javapuzzlers.p03;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongDivisionSolutionTest {

  @Test
  public void dividesCorrectly() throws Exception {
    assertThat(LongDivisionSolution.longDivide()).isEqualTo(1000L);
  }

}