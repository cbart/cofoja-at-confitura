package pl.confitura.contracts.list;

import com.google.common.collect.Iterators;

import java.util.Deque;

/**
 * @author cbr@touk.pl
 */
public class DequeBackedRecentlyUsedList<T>
    implements RecentlyUsedList<T> {
  private final Deque<T> sequence;

  DequeBackedRecentlyUsedList(final Deque<T> sequence) {
    this.sequence = sequence;
  }

  @Override
  public boolean isEmpty() {
    return sequence.isEmpty();
  }

  @Override
  public int size() {
    return sequence.size();
  }

  @Override
  public boolean contains(final T element) {
    return sequence.contains(element);
  }

  @Override
  public void add(final T element) {
    sequence.remove(element);
    sequence.addFirst(element);
  }

  @Override
  public T get(final int index) {
    final T element = Iterators.get(sequence.iterator(), index);
    add(element);
    return element;
  }

  @Override
  public T front() {
    return sequence.getFirst();
  }
}
