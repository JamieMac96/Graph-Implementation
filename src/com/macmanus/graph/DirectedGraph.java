package com.macmanus.graph;

public class DirectedGraph<T> extends AbstractGraph<T>{

    @Override
    public boolean addEdge(int from, int to) {
        if(containsEdge(from, to)) return false;
        checkIndex(from);
        checkIndex(to);

        adjacencyList.get(from).add(to);

        return true;
    }

}
