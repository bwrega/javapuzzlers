package com.realizationtime.javapuzzlers.chapter01.p02;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.chapter01.p02.Change.change;
import static org.assertj.core.api.Assertions.assertThat;

public class ChangeTest {

  @Test
  public void doubleHoldsDecimalFractionsIncorrectly() throws Exception {
    String changeStr = "" + change();
    assertThat(changeStr.length()).isGreaterThan(4);
    assertThat(changeStr.startsWith("0.8999")).isTrue();
  }

}