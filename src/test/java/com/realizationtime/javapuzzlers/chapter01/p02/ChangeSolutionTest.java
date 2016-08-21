package com.realizationtime.javapuzzlers.chapter01.p02;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.chapter01.p02.ChangeSolution.change;
import static org.assertj.core.api.Assertions.assertThat;

public class ChangeSolutionTest {

  @Test
  public void changeIsCorrect() throws Exception {
    assertThat("" + change()).isEqualTo("0.90");
  }

}