package com.macmanus.graph;

public class WeightedGraph<T> extends AbstractWeightedGraph<T> {

    @Override
    public boolean addEdge(int from, int to, int weight) {
        if(containsEdge(from, to)) return false;
        if((from == to) && weight != 0) return false;
        checkIndex(from);
        checkIndex(to);

        adjacencyList.get(from).add(new WeightedEdge(to, weight));

        if(from != to) adjacencyList.get(to).add(new WeightedEdge(from, weight));

        return true;
    }

    @Override
    public void shortestPath() {

    }
}
