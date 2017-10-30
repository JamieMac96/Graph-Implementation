package com.macmanus.graph;

import java.util.List;

public interface Graph<T> {

    public void addNode(T node);

    public void setNode(int index, T node);

    public T getNode(int index);

    public List<T> getNodes();

    public List<Integer> depthFirstSearch(int source);

    public List<Integer> breadthFirstSearch(int source);

    public boolean containsEdge(int from, int to);
}
