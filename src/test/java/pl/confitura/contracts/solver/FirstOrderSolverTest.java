package pl.confitura.contracts.solver;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author cbr@touk.pl
 */
public class FirstOrderSolverTest {
  @Test public void shouldResultWithZeroWhenTermZeroIsZero() {
    assertThat(solve(42, 0), is("Solution of 0 = 42x + 0 is 0.0\n"));
  }

  @Test public void shouldSolveEquationWithPositiveZeroTerm() {
    assertThat(solve(1, 2), is("Solution of 0 = 1x + 2 is -2.0\n"));
  }

  private String solve(final int a, final int b) {
    final FirstOrderSolver solver = new FirstOrderSolver(a, b);
    solver.solve();
    return solver.getTextSolution();
  }
}
