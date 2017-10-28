package com.macmanus.graph;

public class UseGraph {
    public static void main(String [] args){
        AbstractGraph<String> uGraph = new SimpleGraph<>();

        uGraph.addNode("node 1");
        uGraph.addNode("node 2");
        uGraph.addNode("node 3");
        uGraph.addNode("node 4");


        uGraph.addEdge("node 1","node 4");

        System.out.println(uGraph);

        uGraph.setNode(0, "node 1 changed");

        System.out.println(uGraph);
    }
}
