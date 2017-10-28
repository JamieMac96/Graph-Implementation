package com.macmanus.graph;

import com.macmanus.linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SimpleGraph<T> extends AbstractGraph<T> {

    @Override
    public void addEdge(int from, int to) {

    }

    @Override
    public void addEdge(T from, T to) {

    }

    @Override
    public String toString(){
        String output = "";

        for(int i = 0; i < nodes.size(); i++){
            output += nodes.get(i) + "===>" + adjacencyList.get(i).toString() + "\n";
        }

        return output;
    }
}
