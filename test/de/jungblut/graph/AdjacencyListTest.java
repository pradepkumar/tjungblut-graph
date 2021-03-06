package de.jungblut.graph;

import junit.framework.TestCase;

import org.junit.Test;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomains;
import com.google.common.collect.Ranges;

import de.jungblut.graph.model.Vertex;

public class AdjacencyListTest extends TestCase {

  @Test
  public void testGraphRepresentation() {
    Graph<Integer, String, Integer> wikipediaExampleGraph = TestGraphProvider
        .getWikipediaExampleGraph();
    ContiguousSet<Integer> set = Ranges.open(0, 9).asSet(
        DiscreteDomains.integers());

    // check if all vertices can be retrieved correctly and the size are correct
    assertEquals(10, wikipediaExampleGraph.getNumVertices());
    assertEquals(21, wikipediaExampleGraph.getNumEdges());

    for (Integer i : set) {
      Vertex<Integer, String> vertex = wikipediaExampleGraph.getVertex(i);
      assertNotNull(vertex);
    }

  }
}
