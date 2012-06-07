package pl.confitura.contracts.fibonacci;

import com.google.java.contract.Requires;

/**
 * @author cbart@students.mimuw.edu.pl (Cezary Bartoszuk)
 */
public interface Fibonacci {
  @Requires("index >= 0")
  int apply(int index);
}
