package pl.confitura.contracts.fibonacci;

/**
 * @author cbart@students.mimuw.edu.pl (Cezary Bartoszuk)
 */
public class RecursiveFibonacci implements Fibonacci {
  @Override
  public int apply(int n) {
    if (0 == n || 1 == n) {
      return n;
    } else {
      return apply(n - 1) + apply(n - 2);
    }
  }
}
