package com.macmanus.test.weightedgraph;

import com.macmanus.graph.AbstractWeightedGraph;
import com.macmanus.graph.WeightedEdge;
import com.macmanus.graph.WeightedGraph;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.macmanus.linkedlist.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestWeightedGraph {
    private AbstractWeightedGraph<String> graph;

    @BeforeEach
    public void setUp(){
        graph = new WeightedGraph<>();

        graph.addNode("1");
        graph.addNode("2");
        graph.addNode("3");
        graph.addNode("4");
        graph.addNode("5");
        graph.addNode("6");
        graph.addNode("7");
        graph.addNode("8");
        graph.addNode("9");
        graph.addNode("10");
    }

    @Test
    void testAddNodes(){
        assertTrue(graph.getNodes().size() == 10);
        assertTrue(graph.getNodes().get(0).equals("1"));
        assertTrue(graph.getNodes().get(3).equals("4"));
        assertTrue(graph.getNodes().get(9).equals("10"));
    }

    @Test
    void testAddEdgesByIndex(){
        graph.addEdge(0, 2, 12);
        graph.addEdge(3, 2, 3);
        graph.addEdge(5, 2, 22);
        graph.addEdge(7, 2, 5);

        LinkedList<WeightedEdge> edgesTwo = graph.getEdges().get(2);
        LinkedList<WeightedEdge> edgesNine = graph.getEdges().get(9);
        LinkedList<WeightedEdge> edgesZero = graph.getEdges().get(0);

        assertTrue(edgesTwo.size() == 4);
        assertTrue(edgesNine.size() == 0);
        assertTrue(edgesZero.get(0).getNodexIndex() == 2);
    }

    @Test
    void testAddEdgesByValue(){
        graph.addEdge("1", "3", 12);
        graph.addEdge("4", "3", 3);
        graph.addEdge("6", "3", 22);
        graph.addEdge("8", "8", 5);

        LinkedList<WeightedEdge> edgesTwo = graph.getEdges().get(2);
        LinkedList<WeightedEdge> edgesNine = graph.getEdges().get(9);
        LinkedList<WeightedEdge> edgesZero = graph.getEdges().get(0);

        assertTrue(edgesTwo.size() == 3);
        assertTrue(edgesNine.size() == 0);
        assertTrue(edgesZero.get(0).getNodexIndex() == 2);
    }
}
