package de.jungblut.graph;

import junit.framework.TestCase;

import org.junit.Test;

public class TupleTest extends TestCase {

  @Test
  public void testTuple() {
    Tuple<Integer, String> tp = new Tuple<>(1, "abc");

    assertEquals(1, tp.getFirst().intValue());
    assertEquals("abc", tp.getSecond());
  }
}
