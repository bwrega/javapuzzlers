package com.realizationtime.javapuzzlers.chapter01.p04;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.chapter01.p04.ElementarySolution.elementaryString;
import static org.assertj.core.api.Assertions.assertThat;

public class ElementarySolutionTest {

  @Test
  public void uppercaseLFtw() throws Exception {
    assertThat(elementaryString()).isEqualTo("17777");
  }

}