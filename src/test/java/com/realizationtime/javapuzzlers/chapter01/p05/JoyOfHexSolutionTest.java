package com.realizationtime.javapuzzlers.chapter01.p05;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.chapter01.p05.JoyOfHexSolution.joyOfHex;
import static org.assertj.core.api.Assertions.*;

public class JoyOfHexSolutionTest {

  @Test
  public void longUsedFtw() throws Exception {
    assertThat(joyOfHex()).isEqualTo("1cafebabe");
  }

}