package com.macmanus.graph;

public class UndirectedGraph<T> extends AbstractGraph<T> {

    @Override
    public boolean addEdge(int from, int to) {
        if(containsEdge(from, to)) return false;
        checkIndex(from);
        checkIndex(to);

        adjacencyList.get(from).add(to);

        if(from != to) adjacencyList.get(to).add(from);

        return true;
    }
}
