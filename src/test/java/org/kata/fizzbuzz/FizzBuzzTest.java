package org.kata.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Unit test for simple App. */
public class FizzBuzzTest {
  FizzBuzz fizzBuzz;

  @BeforeEach()
  public void setup() {
    fizzBuzz = new FizzBuzz();
  }

  @Test()
  public void givenMultiple3_returnFizz() {
    assertEquals("Fizz", fizzBuzz.calculate(3));
  }
}
