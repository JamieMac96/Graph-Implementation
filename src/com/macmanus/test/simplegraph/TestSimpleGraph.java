package com.macmanus.test.simplegraph;

import com.macmanus.graph.AbstractGraph;
import com.macmanus.graph.SimpleGraph;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSimpleGraph {
    AbstractGraph<String> graph;

    @BeforeEach
    void setUp(){
        graph = new SimpleGraph<>();

        graph.addNode("hello");
        graph.addNode("there");
        graph.addNode("is");
        graph.addNode("a");
        graph.addNode("new");
        graph.addNode("simple");
        graph.addNode("graph");
    }


    @Test
    void testAddNode(){
        assertEquals(7, graph.getNodes().size());
        assertEquals(7, graph.getEdges().size());
    }
}
