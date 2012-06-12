package pl.confitura.contracts;

import com.google.java.contract.Requires;

/**
 * @author cbart@students.mimuw.edu.pl (Cezary Bartoszuk)
 */
public class FirstOrderSolver {
  private final int a;
  private final int b;
  private double solution = 0.;

  /**
   * @param a a parameter in f(x) = ax + b
   * @param b b parameter in f(x) = ax + b
   */
  public FirstOrderSolver(final int a, final int b) {
    this.a = a;
    this.b = b;
  }

  public void solve() {
    solution = -(b / a);
  }

  public void printSolution() {
    System.out.print(endLine("Solution of 0 = " + a + "x + " + b + " is " + solution));
  }

  public static String endLine(final String line) {
    return line.endsWith("\n") ? line : (line + "\n");
  }
}
