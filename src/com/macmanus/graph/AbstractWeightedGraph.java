package com.macmanus.graph;

import java.util.List;

public abstract class AbstractWeightedGraph<T> extends BaseAbstractGraph<T> {

    @Override
    public void addNode(T node) {

    }

    @Override
    public void depthFirstSearch() {

    }

    @Override
    public void breadthFirstSearch() {

    }

    @Override
    public boolean containsEdge(int from, int to) {
        return false;
    }


    public abstract void shortestPath();
    public abstract void addEdge(int from, int to, int weight);
    public abstract void addEdge(T from, T to, int weight);
}
