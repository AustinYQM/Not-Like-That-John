/** Created By AustinYQM **/
package com.yqmonline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void addInts() {
    assertEquals(5, Calculator.addInts(2, 3));
    assertEquals(4, Calculator.addInts(6, -2));
  }
}
