package pl.confitura.contracts.fibonacci;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author cbart@students.mimuw.edu.pl (Cezary Bartoszuk)
 */
public class FibonacciTest {
  final Fibonacci fibonacci = new RecursiveFibonacci();

  @Test
  public void zeroFibonacciNumberIsZero() {
    assertThat(fibonacci(0), equalTo(0));
  }

  @Test
  public void firstFibonacciNumberIsOne() {
    assertThat(fibonacci(1), equalTo(1));
  }

  @Test
  public void secondFibonacciNumberIsOne() {
    assertThat(fibonacci(2), equalTo(1));
  }

  @Test
  public void negativeFibonacciIndexIsNonsense() {
    fibonacci(-1);
  }

  private int fibonacci(int index) {
    return fibonacci.apply(index);
  }
}
