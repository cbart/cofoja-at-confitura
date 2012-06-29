package pl.confitura.contracts.list;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

/**
 * @author cbr@touk.pl
 */
@Invariant({
    "isEmpty() == (0 == size())",
    "isEmpty() || (get(0) == front())"
})
public interface RecentlyUsedList<T> {
  @Ensures("result == (0 == size())")
  boolean isEmpty();

  @Ensures("result >= 0")
  int size();

  @Ensures("!(null == element) || (false == result)")
  boolean contains(T element);

  @Requires("null != element")
  @Ensures({
      "!old(contains(element)) == (old(size()) + 1 == size())",
      "old(contains(element)) == (old(size()) == size())",
      "element == front()"
  })
  void add(T element);

  @Requires({
      "0 <= index",
      "index < size()",
      "!isEmpty()"
  })
  @Ensures({
      "null != result",
      "result == front()"
  })
  T get(int index);

  @Requires("!isEmpty()")
  @Ensures({
      "null != result",
      "result == get(0)"
  })
  T front();
}
