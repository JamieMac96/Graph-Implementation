package com.macmanus.graph;

public class DirectedGraph<T> extends Graph{
    @Override
    public boolean isPlanar() {
        return false;
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

    @Override
    public void depthFirstSearch() {

    }

    @Override
    public void bredthFirstSearch() {

    }

    @Override
    public void shortestPath() {

    }
}
