package pl.confitura.contracts.stack;

import org.junit.Ignore;
import org.junit.Test;
import pl.confitura.contracts.stack.linked.LinkedStack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author cbr@touk.pl
 */
public class StackTest {
  private final Stack<Integer> stack = new LinkedStack<Integer>();

  @Test public void popShouldYieldSameElementAsPushed() {
    stack.push(42);
    assertThat(stack.pop(), is(42));
  }

  @Ignore
  @Test public void breakPopContract() {
    stack.pop();
  }

  @Test public void strangeStack() {
    new StrangeStack<Integer>().pop();
  }

  private class StrangeStack<T> implements Stack<T> {
    int size = 1;

    @Override
    public T pop() {
      size--;
      return null;
    }

    @Override
    public void push(final T element) {
      size++;
    }

    @Override
    public boolean isEmpty() {
      return size == 0;
    }

    @Override
    public int size() {
      return size;
    }
  }
}
