package com.macmanus.graph;

public class UseGraph {
    public static void main(String [] args){
        AbstractGraph<Integer> uGraph = new SimpleGraph<>();

        uGraph.addNode(1);
        uGraph.addNode(7);
        uGraph.addNode(13);
        uGraph.addNode(666);

        uGraph.addEdge(0, 1);

        System.out.println(uGraph);
    }
}
