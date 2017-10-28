package com.macmanus.graph;

public class DirectedGraph<T> extends AbstractGraph<T>{

    @Override
    public boolean addEdge(int from, int to) {
        return false;
    }

    @Override
    public boolean addEdge(T from, T to) {
        return false;
    }

    @Override
    public void depthFirstSearch() {

    }

    @Override
    public void bredthFirstSearch() {

    }
}
