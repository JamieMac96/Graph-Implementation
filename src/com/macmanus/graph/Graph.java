package com.macmanus.graph;

import java.util.ArrayList;
import java.util.List;

import com.macmanus.linkedlist.LinkedList;

public interface Graph<T> {

    public void addNode(T node);

    public void setNode(int index, T node);

    public T getNode(int index);

    public List<T> getNodes();

    public void depthFirstSearch();

    public void breadthFirstSearch();

    public boolean containsEdge(int from, int to);

}
