package pl.confitura.contracts.list;

import com.google.java.contract.Ensures;

import java.util.LinkedList;

/**
 * @author cbr@touk.pl
 */
public class RecentlyUsedLists {
  private RecentlyUsedLists() {}

  @Ensures("0 == result.size()")
  public static <T> RecentlyUsedList<T> newDequeBackedList() {
    return new DequeBackedRecentlyUsedList<T>(new LinkedList<T>());
  }
}
