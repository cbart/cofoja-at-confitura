package pl.confitura.contracts.stack;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

/**
 * @author cbr@touk.pl
 */
@Invariant({
    "size() >= 0",
    "isEmpty() == (size() == 0)"
})
public interface Stack<T> {
  @Ensures("size() == old(size()) - 1")
  @Requires("!isEmpty()")
  T pop();

  @Ensures("size() == old(size()) + 1")
  void push(T element);

  @Ensures("result == (size() == 0)")
  boolean isEmpty();

  @Ensures("result >= 0")
  int size();
}