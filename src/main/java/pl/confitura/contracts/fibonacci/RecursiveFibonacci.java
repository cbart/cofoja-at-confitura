package pl.confitura.contracts.fibonacci;

import com.google.java.contract.Requires;

/**
 * @author cbart@students.mimuw.edu.pl (Cezary Bartoszuk)
 */
public class RecursiveFibonacci {
  @Requires("n >= 0")
  public int apply(int n) {
    if (0 == n || 1 == n) {
      return n;
    } else {
      return apply(n - 1) + apply(n - 2);
    }
  }
}
