package pl.confitura.contracts.solver;

import org.junit.Test;

/**
 * @author cbr@touk.pl
 */
public class FirstOrderSolverRandomTest {
  @Test(expected = ArithmeticException.class)
  public void shouldNotAcceptZeroAsA() {
    new FirstOrderSolver(0, 2147483647).solve();
  }

  @Test(expected = NullPointerException.class)
  public void endLineShouldNotBeCallableExternally() {
    FirstOrderSolver.endLine(null);
  }
}
