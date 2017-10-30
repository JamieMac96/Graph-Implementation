package com.macmanus.graph;

import com.macmanus.linkedlist.LinkedList;

import java.util.List;

public class DirectedWeightedGraph<T> extends AbstractWeightedGraph<T> {

    @Override
    public boolean addEdge(int from, int to, int weight) {
        if(containsEdge(from, to)) return false;
        if((from == to) && weight != 0) return false;
        checkIndex(from);
        checkIndex(to);

        adjacencyList.get(from).add(new WeightedEdge(to, weight));

        return true;
    }

    @Override
    public void shortestPath() {

    }
}
