package com.macmanus.test.directedweightedgraph;

import com.macmanus.graph.AbstractWeightedGraph;
import com.macmanus.graph.DirectedWeightedGraph;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDirectedWeightedGraph {
    private AbstractWeightedGraph<Double> graph;

    @BeforeEach
    void setUp(){
        graph = new DirectedWeightedGraph<>();

        graph.addNode(2.2);
        graph.addNode(12.5);
        graph.addNode(7.3);
        graph.addNode(1.1);
        graph.addNode(6.1);
        graph.addNode(123.4);
    }

    @Test
    void testAddNodes(){
        assertTrue(graph.getNodes().size() == 6);
        assertTrue(graph.getEdges().size() == 6);
    }

    @Test
    void testAddEdgesByIndex(){
        graph.addEdge(0,1, 5);
        graph.addEdge(2,5,8);
        graph.addEdge(2,4, 4);
        graph.addEdge(5,4,2);

        assertTrue(graph.getEdges().get(2).size() == 2);
        assertTrue(graph.getEdges().get(5).size() == 1);
    }

    @Test
    void testAddEdgesByValue(){
        graph.addEdge(2.2,12.5, 5);
        graph.addEdge(7.3,123.4,8);
        graph.addEdge(7.3,6.1, 4);
        graph.addEdge(123.4,6.1,2);

        assertTrue(graph.getEdges().get(2).size() == 2);
        assertTrue(graph.getEdges().get(5).size() == 1);
    }
}
