package com.macmanus.test;

import com.macmanus.graph.AbstractGraph;
import com.macmanus.graph.DirectedGraph;
import com.macmanus.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDirectedGraph {
    private AbstractGraph<String> myGraph;

    @BeforeEach
    void setUp(){
        myGraph = new DirectedGraph<>();

        myGraph.addNode("looooooooooooooooooooooooooongggggggggggggggggggggggggggggggggg string");
        myGraph.addNode("string");
        myGraph.addNode("blah");
        myGraph.addNode("another");
        myGraph.addNode("node");
        myGraph.addNode("here");
        myGraph.addNode("test data");
        myGraph.addNode("test");
        myGraph.addNode("data");
        myGraph.addNode("test data 123");




    }

    @Test
    void testAddNodes(){
        assertEquals(10, myGraph.getNodes().size());
        assertEquals(10, myGraph.getEdges().size());
    }

    @Test
    void testAddEdgesByIndex(){
        myGraph.addEdge(0, 6);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(4, 3);

        LinkedList<Integer> edgesZero = myGraph.getEdges().get(0);
        LinkedList<Integer> edgesFour = myGraph.getEdges().get(4);
        LinkedList<Integer> edgesThree = myGraph.getEdges().get(3);


        assertTrue(edgesZero.size() == 1);
        assertTrue(edgesFour.size() == 1);
        assertTrue(edgesThree.size() == 0);
        assertTrue(edgesFour.getFirst().equals(3));
    }

    @Test
    void addEdgesByValue(){
        myGraph.addEdge("test", "string");
        myGraph.addEdge("data", "test data");
        myGraph.addEdge("blah", "another");
        myGraph.addEdge("here", "another");

        LinkedList<Integer> edgesTwo = myGraph.getEdges().get(2);
        LinkedList<Integer> edgesNine = myGraph.getEdges().get(9);

        assertTrue(edgesTwo.size() == 1);
        assertTrue(edgesNine.size() == 0);
    }

    @Test
    void testDepthFirstSearch(){
        myGraph.addEdge("test", "string");
        myGraph.addEdge("data", "test data");
        myGraph.addEdge("blah", "another");
        myGraph.addEdge("here", "another");

        assertTrue(myGraph.depthFirstSearch(0).size() == 1);
    }
}
