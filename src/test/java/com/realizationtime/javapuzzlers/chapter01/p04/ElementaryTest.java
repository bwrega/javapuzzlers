package com.realizationtime.javapuzzlers.chapter01.p04;

import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.chapter01.p04.Elementary.elementaryString;
import static org.assertj.core.api.Assertions.assertThat;

public class ElementaryTest {

  @Test
  public void lowercaseLGives17777() throws Exception {
    assertThat(elementaryString()).isEqualTo("17777");
  }

}