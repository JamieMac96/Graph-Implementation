package com.macmanus.graph;

import java.util.ArrayList;
import java.util.List;

import com.macmanus.linkedlist.LinkedList;

public interface Graph<T> {

    public void addNode(T node);

    public void depthFirstSearch();

    public void bredthFirstSearch();

    public boolean containsEdge(int from, int to);

    public boolean isPlanar();

    public void isEularian();

    public boolean isTree();

    public boolean isConnected();

    public boolean isComplete();

}
