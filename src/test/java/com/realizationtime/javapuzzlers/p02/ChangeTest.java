package com.realizationtime.javapuzzlers.p02;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.p02.Change.change;
import static org.testng.Assert.assertTrue;

public class ChangeTest {

  @Test
  public void doubleHoldsDecimalFractionsIncorrectly() throws Exception {
    String changeStr = "" + change();
    assertTrue(changeStr.length() > 4);
    assertTrue(changeStr.startsWith("0.8999"));
  }

}