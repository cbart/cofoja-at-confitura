package pl.confitura.contracts.stack.linked;

import pl.confitura.contracts.stack.Stack;

/**
 * @author cbr@touk.pl
 */
public final class LinkedStack<T> implements Stack<T> {
  private Cell<T> head = new Nil<T>();

  @Override
  public T pop() {
    final T element = head.getElement();
    head = head.getNext();
    return element;
  }

  @Override
  public void push(final T element) {
    head = new Cons<T>(element, head);
  }

  @Override
  public boolean isEmpty() {
    return head.isNil();
  }

  @Override
  public int size() {
    return head.length();
  }

  private static interface Cell<U> {
    U getElement();
    Cell<U> getNext();
    int length();
    boolean isNil();
  }

  private static final class Cons<U> implements Cell<U> {
    final U element;
    final Cell<U> next;

    Cons(final U element, final Cell<U> next) {
      this.element = element;
      this.next = next;
    }

    @Override
    public U getElement() {
      return element;
    }

    @Override
    public Cell<U> getNext() {
      return next;
    }

    @Override
    public int length() {
      return next.length() + 1;
    }

    @Override
    public boolean isNil() {
      return false;
    }
  }

  private static final class Nil<U> implements Cell<U> {
    @Override
    public U getElement() {
      throw new IllegalStateException("Empty stack.");
    }

    @Override
    public Cell<U> getNext() {
      throw new IllegalStateException("Empty stack.");
    }

    @Override
    public int length() {
      return 0;
    }

    @Override
    public boolean isNil() {
      return true;
    }
  }
}
