package com.macmanus.graph;

import com.macmanus.linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SimpleGraph<T> extends AbstractGraph<T> {

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
