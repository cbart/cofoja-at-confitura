package pl.confitura.contracts.list;

import com.google.java.contract.PreconditionError;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author cbr@touk.pl
 */
public class DequeBackedRecentlyUsedListTest {
  @Test(expected = PreconditionError.class)
  public void gettingElementFromEmptyListShouldBreakContract() {
    RecentlyUsedList<?> list = RecentlyUsedLists.newDequeBackedList();
    list.get(1);
  }

  @Test public void mostLatelyFetchedElementShouldBeAtFront() {
    RecentlyUsedList<String> list = listOf("a", "b", "c");
    list.get(1);
    assertThat(list.front(), is("b"));
  }

  private static <T> RecentlyUsedList<T> listOf(final T... allElements) {
    RecentlyUsedList<T> list = RecentlyUsedLists.newDequeBackedList();
    for (final T element : allElements) {
      list.add(element);
    }
    return list;
  }
}
