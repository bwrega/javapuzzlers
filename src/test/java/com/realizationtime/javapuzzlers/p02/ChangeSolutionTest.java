package com.realizationtime.javapuzzlers.p02;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.p02.ChangeSolution.change;
import static org.testng.Assert.assertEquals;

public class ChangeSolutionTest {

  @Test
  public void changeIsCorrect() throws Exception {
    assertEquals("" + change(), "0.90");
  }

}