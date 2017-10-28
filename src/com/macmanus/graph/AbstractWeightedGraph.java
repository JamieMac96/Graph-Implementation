package com.macmanus.graph;

import java.util.List;

public abstract class AbstractWeightedGraph<T> implements Graph<T> {
    List<T> nodes;

    @Override
    public void addNode(T node) {

    }

    @Override
    public void depthFirstSearch() {

    }

    @Override
    public void bredthFirstSearch() {

    }

    @Override
    public boolean containsEdge(int from, int to) {
        return false;
    }

    @Override
    public boolean isPlanar() {
        return false;
    }

    @Override
    public void isEularian() {

    }

    @Override
    public boolean isTree() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    public abstract void shortestPath();
    public abstract void addEdge(int from, int to, int weight);
    public abstract void addEdge(T from, T to, int weight);
}
