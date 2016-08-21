package com.realizationtime.javapuzzlers.p02;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.p02.Change.change;
import static org.testng.Assert.assertEquals;

public class ChangeTest {

  @Test(enabled = false)
  public void changeIsCorrect() throws Exception {
    assertEquals("" + change(), "0.9");
  }

}