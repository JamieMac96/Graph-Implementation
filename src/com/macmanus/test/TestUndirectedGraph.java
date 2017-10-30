package com.macmanus.test;

import com.macmanus.graph.AbstractGraph;
import com.macmanus.graph.UndirectedGraph;
import com.macmanus.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestUndirectedGraph {
    private AbstractGraph<String> graph;

    @BeforeEach
    void setUp(){
        graph = new UndirectedGraph<>();

        graph.addNode("hello");
        graph.addNode("there");
        graph.addNode("is");
        graph.addNode("a");
        graph.addNode("new");
        graph.addNode("simple");
        graph.addNode("graph");
    }


    @Test
    void testAddNodes(){
        assertTrue(7 == graph.getNodes().size());
        assertTrue(7 == graph.getEdges().size());
    }

    @Test
    void testAddEdgesByIndex(){
        graph.addEdge(0, 6);
        graph.addEdge(2, 3);
        graph.addEdge(4, 3);

        LinkedList<Integer> replicaEdgesThree = new LinkedList<>();
        replicaEdgesThree.add(2);
        replicaEdgesThree.add(4);

        LinkedList<Integer> edgesZero = graph.getEdges().get(0);
        LinkedList<Integer> edgesOne = graph.getEdges().get(1);
        LinkedList<Integer> edgesThree = graph.getEdges().get(3);


        assertTrue(edgesZero.size() == 1);
        assertTrue(edgesOne.size() == 0);
        assertTrue(edgesThree.size() == 2);
        assertTrue(replicaEdgesThree.equals(edgesThree));
    }

    @Test
    void addEdgesByValue(){
        graph.addEdge("hello", "simple");
        graph.addEdge("there", "is");
        graph.addEdge("a", "graph");
        graph.addEdge("hello", "graph");

        LinkedList<Integer> replicaEdgesZero = new LinkedList<>();
        replicaEdgesZero.add(5);
        replicaEdgesZero.add(6);

        LinkedList<Integer> edgesZero = graph.getEdges().get(0);
        LinkedList<Integer> edgesOne = graph.getEdges().get(1);
        LinkedList<Integer> edgesSix = graph.getEdges().get(6);

        assertTrue(edgesZero.size() == 2);
        assertTrue(edgesOne.size() == 1);
        assertTrue(edgesSix.size() == 2);
        assertTrue(replicaEdgesZero.equals(edgesZero));
    }

    @Test
    void testBreadthFirstSearch(){
        graph.addEdge("hello", "simple");
        graph.addEdge("there", "is");
        graph.addEdge("a", "graph");
        graph.addEdge("hello", "graph");

        assertTrue(graph.depthFirstSearch(0).size() == 4);
    }
}
