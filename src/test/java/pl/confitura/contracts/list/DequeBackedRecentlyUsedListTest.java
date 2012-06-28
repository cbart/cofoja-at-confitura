package pl.confitura.contracts.list;

import org.junit.Test;

/**
 * @author cbart@students.mimuw.edu.pl (Cezary Bartoszuk)
 */
public class DequeBackedRecentlyUsedListTest {
  @Test
  public void shouldBreakContract() {
    RecentlyUsedList<?> list = RecentlyUsedLists.newDequeBackedList();
    list.get(1);
  }
}
