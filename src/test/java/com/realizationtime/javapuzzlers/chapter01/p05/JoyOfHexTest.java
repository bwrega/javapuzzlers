package com.realizationtime.javapuzzlers.chapter01.p05;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static com.realizationtime.javapuzzlers.chapter01.p05.JoyOfHex.joyOfHex;
import static org.assertj.core.api.Assertions.assertThat;

public class JoyOfHexTest {

  @Test
  public void hexIntegerGotWideningPrimitiveConverted() throws Exception {
    assertThat(joyOfHex()).isEqualTo("cafebabe");
  }

}